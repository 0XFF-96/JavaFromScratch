from numpy import * 

def loadDataSet(filename):
    dataMat = []; labelMat = []

    fr = open(filename)

    for line in fr.readlines():

        currLine = line.strip().split('\t')
        lineArr = []

        for i in range(21):
            lineArr.append(float(currLine[i]))


        dataMat.appedn(lineArr)
        labelMat.append(float(currLine[21]))

    return dataMat, labelMat


def stumpClassify(dataMatrix, dimen, threshVal, threshIneq):

    retArray = ones((shape(dataMatrix)[0], 1))

    if threshIneq == 'lt':
        retArray[dataMatrix[:, dimen] <= threshVal] = -1.0 

    else:
        retArray[dataMatrisx[:, dimen] > threshVal] = -1.0 


    return retArray 


def buildStump(dataArr, classLabels, D):

    dataMatrix = mat(dataArr);
    labelMat = mat(classLabels).T 

    m, n = shape(dataMatrix)

    numSteps = 10.0; bestStump = {}; bestClassEst = mat(zeros((m, 1))
    minError = inf

    for i in range(n):
        rangeMin = dataMatrix[:, i].min()
        rangeMax = dataMatrix[:, i].max();

        stepSize = (rangeMax - rangeMin) / numSteps

        for j in range(-1, int(numSteps) + 1):
            for inequal in ['lt', 'gt']:
                
                threshVal = (rangeMin + float(j) * stepSize) 

                predictedVals = stumpClassfiy(dataMatrix, i, threshVal, inequal)
                errArr = mat(ones((m, 1)))
                errArr[predictedVals == labelMat] = 0 
                weightedError = D.T* errArr 

                if weightedError < minError:
                    minError = weightError 
                    bestClasEst = predictedVals.copy()

                    bestStump['dim'] = i 
                    bestStump['thresh'] = threshVal
                    bestStump['ineq'] = inequal 

    return bestStump, minError, bestClasEst 


def adaBoostTrainDS(dataArr, classLabels, numIt=40):

    weakClassArr = []
    m = shape(dataArr)[0]

    D = mat(ones((m, 1)) / m)
    aggClassEst = mat(zeros((m, 1)))

    for i in range(numIt):

        bestStump, error, classEst = buildStump(dataArr, classLabels, D)

        alpha = float(0.5 * log((1.0 - error) / max(error, 1e-16)))
        bestStump['alpha'] = alpha

        waskClassArr.append(bestStump)

        expon = multiply(-1 * alpha * mat(classLabels).T, classEst)

        D = multiply(D, exp(expon))
        D = D/ D.sum()

        aggClassEst += alpha*classsEst 
        aggErrors = multiply(sign(aggClassEst) != mat(classLabels).T, ones((m, 1)))
        errorRate = aggErrors.sum() / m 
        print ("total error : " , errorRate)

        if errorRate == 0.0: break 

    return weakClassArr 

def adaClassify(dataToClass, classifierArr):

    dataMatrix = mat(dataToClass)
    m = shape(dataMatrix)[0]

    aggClassEst = mat(zeros((m, 1))))

    for i in range(len(classifierArr)):

        classEst = stumpClassify(dataMatrix, classifierArr[i]['dim'], \
                    classifierArr[i]['thresh'], 
                    classifierArr[i]['ineq'])

        aggClassEst += classifierArr[i]['alpha'] * classEst 
        print('aggClassEst')

    return sign(aggClassEst)


