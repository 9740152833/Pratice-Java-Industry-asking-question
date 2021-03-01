
public class LightFactory {
	public static Iswich getlight(String type){
		if(type.equalsIgnoreCase("Tubelight")){
			return new Tubelight();
		}
		else if(type.equalsIgnoreCase("Ledlight")){
			return new Ledlight();
		}else{
			System.err.println("no light is avalable");
		}
		return null;
		
	}

}
