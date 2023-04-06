package Demo04.Demo0401;

import java.util.Arrays;
//ProductionNotFoundException
public class Store {

    private Product[] products;


    public Store(Product[] products) {
        this.products = products;
    }

    public void buyProductOld(String name) throws Production {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                if (product.getStock() > 0) {
                    System.out.println("购买成功，商品名称：" + name);
                    product.setStock(product.getStock() - 1);
                    return;
                } else {
                    throw new Production("商品已售罄，商品名称：" + name);
                }
            }
        }
        throw new Production("商品不存在，商品名称：" + name);
    }

    public void buyProduct(String name) throws Production {

        if (name == null || "".equals(name.trim())) {
            throw new Production("您的输入有误，请重新输入");
        }

        boolean judgeNameExistFlag = Arrays.stream(products).anyMatch(product -> name.equals(product.getName()));

        if (judgeNameExistFlag) {
            Arrays.stream(products).forEach(product -> {
                if (product.getName().equals(name)) {
                    //找到商品
                    if (product.getStock() > 0) {
                        System.out.println("购买成功,商品名称是:" + name);
                        product.setStock(product.getStock() - 1);
                        return;
                    } else {
                        throw new Production("商品已经售罄,商品名称是:" + name);
                    }
                }
            });
        }
        throw new Production("商品不存在，商品名称是:" + name);
    }
}
