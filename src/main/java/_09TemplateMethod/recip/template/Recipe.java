package _09TemplateMethod.recip.template;

public abstract class Recipe {

    //we have generalized the 2 methods brew and addCondiments to be able to use the in both coffee and tea
    // declared final so the subclasses are not able to modify it .
    public final void prepareRecipe() {

        boilWater();

        brew();

        pourInCoup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void pourInCoup() {
        System.out.println("Pouring into the cups");
    }

    public boolean customerWantsCondiments() {
        return true;
    }

}
