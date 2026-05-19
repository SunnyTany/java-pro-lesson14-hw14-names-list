package app;

public class Main {

    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();

        try {
            uiOperator.getOutput(handler.formListOutput(repository.getData()));
            uiOperator.getOutput(handler.formOutput(repository.getData(), 2));
        } catch (IllegalArgumentException e) {
            uiOperator.getOutput("Error: " + e.getMessage());
        }
    }
}