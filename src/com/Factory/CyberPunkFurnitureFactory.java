package com.Factory;

import com.Director;
import com.Furniture.Builder.ChairBuilder;
import com.Furniture.Builder.SofaBuilder;
import com.Furniture.Builder.TableBuilder;
import com.Furniture.Furniture;

public class CyberPunkFurnitureFactory implements BaseFactory{

    private static volatile CyberPunkFurnitureFactory cyberPunkFurnitureFactory;
    private Director director = new Director();

    private CyberPunkFurnitureFactory() {}

    public static CyberPunkFurnitureFactory getCyberPunkFurnitureFactoryFactory() {
        if (cyberPunkFurnitureFactory == null)
            synchronized (CyberPunkFurnitureFactory.class) {
                if (cyberPunkFurnitureFactory == null)
                    cyberPunkFurnitureFactory = new CyberPunkFurnitureFactory();
            }
        return cyberPunkFurnitureFactory;
    }

    @Override
    public Furniture createFurniture(String type) {
        switch (type){
            case "chair":
                ChairBuilder chairPBuilder = new ChairBuilder();
                director.makeCyberPunkChair(chairPBuilder);
                return chairPBuilder.getProduct();
            case "sofa":
                SofaBuilder sofaPBuilder = new SofaBuilder();
                director.makeCyberPunkSofa(sofaPBuilder);
                return sofaPBuilder.getProduct();
            case "table":
                TableBuilder tablePBuilder = new TableBuilder();
                director.makeCyberPunkTable(tablePBuilder);
                return tablePBuilder.getProduct();
            default:
                return null;
        }
    }
}
