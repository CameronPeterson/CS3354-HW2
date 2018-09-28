package view;
import controller.Controller;
import model.Model;
public interface View {
	Controller getController();
	public void setController(Controller aController);
	public Model getModel();
	public void setModel(Model aModel);
}
