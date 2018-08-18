void perm(int list[] , int s, int e, void(*cbk)(int list[]))
{
    int i;
    {
        (*cbk)(list);
    }
    else
    {
        for(i = s;i <= e;i++)
        {
            swap(list, s, i)
            perm(list, s+1, e, cbk)
            swap(list, s, i)
        }
    }
}

void swap(int *0, int i , int j)
{
    int tem = o[j]
    o[i] = o[j]
    o[j] = tmp;
}

void cbk_print(int *subs)
{
    printf("{");
    for(int i = 0;i < LEN;i++)
    {
        printf("%d", subs[i])
          }
}}

#inlcude <iostream>
#include <algorithm>


template<class T>
void combine(T set[], int n, int k, void(*cbk)(T set[]))
{
    unsigned char * vec = new unsigned char[n];
    T * subset = new T[k];

    for (int i = 0; i < n;i++)
    {
        if (i < k)
            vec[i] = 1;
        else
            vec[i] = 0;
    }

    bool has_next = true;
    while (has_next)
    {
        int j =0;
        for (int i =0; i < n; i++)
        {
            if (vec[i] == 1)
            {
                subset[j++] = set[i];
            }
        }
        cbk(subset);

        has_next = false;
        for (int i =0 ;i < n-1; i++)
        {
            if (vec[i] == 1 && vec[i + 1] == 0)
            {
                vec[i] = 0;
                vec[i+1] = 1;

                int count = 0;
                for (int j = 0;j < i; j++)
                {
                    if (vec[j] == 1)
                        count ++;
                }
                for (int j = count; j < i; j++)
                {
                    vec[j] = 0;
                }
            }

            has_next = true;
            break;
        }
    }
}
delete [] vec;
delete [] subset;
}


void combine(int a[], int n, int m, int b[], const int M)
{
    for(int i=n; i >= m; i--)
    {
        b[m-1] = i -1;
        if (m > 1)
            combine(a, i-1, m-1, b, M);
        else
        {
            for(int j=M-1,j>=0;j--)
                cout 
        }
    }
}

