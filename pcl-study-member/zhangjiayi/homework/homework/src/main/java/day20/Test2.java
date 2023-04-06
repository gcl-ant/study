package day20;

public class Test2 {
    public static void main(String[] args) {
        // 初始化商品列表
        Item[] items = {
                new Item("商品1", 5),
                new Item("商品2", 0),
                new Item("商品3", 10)
        };
        ShoppingCart shoppingCart = new ShoppingCart(items);
        shoppingCart.buyItem("商品1", 2);
        shoppingCart.buyItem("商品2", 3);
        shoppingCart.buyItem("商品3", 5);

        }
    }
