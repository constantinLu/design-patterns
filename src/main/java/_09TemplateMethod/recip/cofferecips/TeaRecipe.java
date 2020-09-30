package _09TemplateMethod.recip.cofferecips;

import _09TemplateMethod.recip.template.Recipe;

public class TeaRecipe extends Recipe {



    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding the lemon");
    }


}
