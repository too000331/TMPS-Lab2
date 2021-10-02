package com.Factory;

import com.Director;
import com.Furniture.Builder.ChairBuilder;
import com.Furniture.Builder.SofaBuilder;
import com.Furniture.Builder.TableBuilder;
import com.Furniture.Furniture;

public class ModerFurnitureFactory implements BaseFactory{

    private static volatile ModerFurnitureFactory moderFurnitureFactory;
    private Director director = new Director();

    public static ModerFurnitureFactory getModerFurnitureFactory() {
        if (moderFurnitureFactory == null)
            synchronized (ModerFurnitureFactory.class) {
                if (moderFurnitureFactory == null)
                    moderFurnitureFactory = new ModerFurnitureFactory();
            }
        return moderFurnitureFactory;
    }

    private ModerFurnitureFactory() {}

    @Override
    public Furniture createFurniture(String type) {
        switch (type) {
            case "chair":
                ChairBuilder chairBuilder = new ChairBuilder();
                director.makeModernChair(chairBuilder);
                return chairBuilder.getProduct();
            case "sofa":
                SofaBuilder sofaBuilder = new SofaBuilder();
                director.makeModernSofa(sofaBuilder);
                return sofaBuilder.getProduct();
            case "table":
                TableBuilder tableBuilder = new TableBuilder();
                director.makeModernTable(tableBuilder);
                return tableBuilder.getProduct();
            default:
                return  null;
        }
    }
}
