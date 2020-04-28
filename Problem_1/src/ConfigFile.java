
public class ConfigFile {
	private static ConfigFile confFile;
	
	private ConfigFile(){}
	
	public static ConfigFile modifyFile(){
		if(confFile == null){
			confFile = new ConfigFile();
		}
		return confFile;
	}
}
