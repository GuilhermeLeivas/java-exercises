package br.com.leivas.exercise9;

public class Solution9 {

    public static void main(String[] args) {
        final Food food = new FoodFactory().produce("Pizza");
        final Food food2 = new FoodFactory().produce("Cake");
        if (food != null) {
            food.makeFood();
        }
        if (food2 != null) {
            food2.makeFood();
        }
    }
}
