public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Ordering more milk...");
            setHasWorkToDo(false);
        } else {
            System.out.println("No work to be done!");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
