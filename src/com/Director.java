package com;

import com.Furniture.Builder.ChairBuilder;
import com.Furniture.Builder.FurnitureBuilder;
import com.Furniture.Builder.SofaBuilder;
import com.Furniture.Builder.TableBuilder;

public class Director {

    public FurnitureBuilder makeModernChair(ChairBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Modern");
        builder.setPrice(600f);
        return builder;
    }

    public FurnitureBuilder makeModernSofa(SofaBuilder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Modern");
        builder.setPrice(2000f);
        return builder;
    }

    public FurnitureBuilder makeModernTable(TableBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Modern");
        builder.setPrice(1700f);
        return builder;
    }

    public FurnitureBuilder makeArtDecoChair(ChairBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Art Deco");
        builder.setPrice(599f);
        return builder;
    }

    public FurnitureBuilder makeArtDecoSofa(SofaBuilder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Art Deco");
        builder.setPrice(3159f);
        return builder;
    }

    public FurnitureBuilder makeArtDecoTable(TableBuilder builder){
        builder.reset();
        builder.setName("Table");
        builder.setStyle("Art Deco");
        builder.setPrice(2050f);
        return builder;
    }

    public FurnitureBuilder makeCyberPunkChair(ChairBuilder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("CyberPunk");
        builder.setPrice(1100f);
        return builder;
    }

    public FurnitureBuilder makeCyberPunkSofa(SofaBuilder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("CyberPunk");
        builder.setPrice(8999.99f);
        return builder;
    }

    public FurnitureBuilder makeCyberPunkTable(TableBuilder builder){
        builder.reset();
        builder.setName("Table");
        builder.setStyle("CyberPunk");
        builder.setPrice(9999.99f);
        return builder;
    }
}
