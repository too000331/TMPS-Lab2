package com.Factory;

import com.Furniture.Furniture;

public interface BaseFactory {
    Furniture createFurniture(String type);
}
