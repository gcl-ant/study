package day20;

public class ShoppingCart {
    private Item[] items; // 商品列表

    public ShoppingCart(Item[] items) {
        this.items = items;
    }

    // 根据商品名称查找商品
    private Item findItemByName(String name) throws ItemException {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        throw new ItemException("商品不存在！");
    }

    // 购买商品
    public void buyItem(String name, int quantity) {
        try {
            Item item = findItemByName(name);
            if (item.getStock() < quantity) {
                throw new ItemException("库存不足！");
            }
            item.setStock(item.getStock() - quantity);
            System.out.println("购买成功，您购买的商品为：" + item.getName() + "，单价为：" + "，数量为：" + quantity);
        } catch (ItemException e) {
            System.out.println("购买失败，原因为：" + e.getMessage());
        }
    }
}
