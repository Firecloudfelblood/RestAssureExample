package Step_Definition;

import Actions.BasicVerbsActions;
import io.cucumber.java.en.Given;

public class BasicVerbs {

    BasicVerbsActions actions = new BasicVerbsActions();
    @Given("^I want to see the existing users")
    public void getUsers(){
        actions.getusers();
    };

    @Given("I want to create a user")
    public void iWantToCreatAUser() {
        actions.postUsers();
    }

    @Given("I want to update a user")
    public void iWantToUpdateAUser() {
        actions.putUser();
    }

    @Given("I want to delete a user")
    public void iWantToDeleteAUser() {
        actions.deleteUser();
    }
}
