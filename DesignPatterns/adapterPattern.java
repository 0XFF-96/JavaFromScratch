public interface CnPluginInterface{
	void chargeWith2Pins();
}

public class CnPlugin implements CnPluginInterface{
	public void chargeWith2Pins(){
		System.out.println("charge with CnPlugin");
	}
}

pbulic class Home{
	private CnPluginInterface cnPlugin;

	public Home(){ }
	public Home(CnPluginInterface cnPlugin){
		this.cnPlugin = cnPlugin;
	}
	public void setPlugin(CnPluginInterface cnPlugin){
		this.cnPlugin = cnPlugin;
	}

	public void charge(){
	
		cnPlugin.chareWith2Pins();
	}
}



public interface EnPluginInterface{
	void chargeWith3Pins();
}

public class EnPlugin implements EnPluginInterface{
	public void chargeWith3Pins(){
		System.out.println("chare with Enplugin");
	}
}

public class PluginAdapter implements CnPluginInterface{
	private EnPluginInterface enPlugin;
	
	public PluginAdapter(EnPluginInterface enPlugin){
		this.enPlugin = enPlugin;
}

@override
public void chargeWith2Pins(){
	enPlugin.chargWith3Pins();
	}
}

public class AdapterTest{
	public static void main(String[] args){
		EnPluginInterface enPlugin = new EnPlugin();
		Home home = new Home()'
		PluginAdapter pluginAdapter = new PluginAdapter(enPlugin);
	
		home.setPlugin(pluginAdapter);
		home.charge();
		}
}


