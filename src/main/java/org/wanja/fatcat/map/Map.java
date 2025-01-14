package org.wanja.fatcat.map;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Map {
    public String name;
    public String type;
    public String orientation;
    public int width;
    public int height;

    public List<LayerProperty> properties;
    @JsonProperty("tileheight")
    public int tileHeight;

    @JsonProperty("tilewidth")
    public int tileWidth;
    public boolean infinite;
    public List<Layer> layers;
    public List<MapTileSet> tilesets;

}
