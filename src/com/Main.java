package com;

import com.Factory.BaseFactory;
import com.Factory.ArtDecoFurnitureFactory;
import com.Factory.CyberPunkFurnitureFactory;
import com.Factory.ModerFurnitureFactory;

public class Main {

    public static void main(String[] args) {
        BaseFactory cyberPunkFactory = CyberPunkFurnitureFactory.getCyberPunkFurnitureFactoryFactory();
        System.out.println(cyberPunkFactory.createFurniture("chair").toString());
        System.out.println(cyberPunkFactory.createFurniture("sofa").toString());
        System.out.println(cyberPunkFactory.createFurniture("table").toString());

        BaseFactory artDecoFactory = ArtDecoFurnitureFactory.getArtDecoFurnitureFactory();
        System.out.println(artDecoFactory.createFurniture("chair").toString());
        System.out.println(artDecoFactory.createFurniture("sofa").toString());
        System.out.println(artDecoFactory.createFurniture("table").toString());

        BaseFactory moderFactory = ModerFurnitureFactory.getModerFurnitureFactory();
        System.out.println(moderFactory.createFurniture("chair").toString());
        System.out.println(moderFactory.createFurniture("sofa").toString());
        System.out.println(moderFactory.createFurniture("table").toString());

    }
}
