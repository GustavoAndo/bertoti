package pattern;

public class Model {

	private static Model model;

	private Model() {
	}

	public static synchronized Model getInstance() {
		if (model== null)
			model = new Model();

		return model;
	}
	
}