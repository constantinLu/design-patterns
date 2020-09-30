package _01Strategy.challange.game.base;


import _01Strategy.challange.game.interfaces.WeponBehavior;

public abstract class Character {

    private int HP;

    private String name;

    private String description;

    private WeponBehavior weponBehavior;

    public abstract void fight();


    public void attack() {
        weponBehavior.useWepon();
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeponBehavior(WeponBehavior weponBehavior) {
        this.weponBehavior = weponBehavior;
    }
}
