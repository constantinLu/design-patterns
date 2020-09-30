package _09TemplateMethod.recip;

import _09TemplateMethod.recip.cofferecips.CoffeeRecipe;
import _09TemplateMethod.recip.cofferecips.TeaRecipe;

public class RecipMakerSimulator {

    public static void main(String[] args) {


        TeaRecipe tea = new TeaRecipe();

        CoffeeRecipe coffee = new CoffeeRecipe();

        tea.prepareRecipe();

        System.out.println("---------------");

        coffee.prepareRecipe();
    }
}
