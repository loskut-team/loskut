package com.loskut.service.filters;

import com.loskut.model.ClothType;
import com.loskut.model.Color;
import com.loskut.model.Feature;
import com.loskut.model.Structure;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by Optical Illusion on 19.01.2016.
 */
public class ClothFilter {
    private int firstResult;
    private int maxResults;
    private BigDecimal pricePerMeterMin;
    private BigDecimal pricePerMeterMax;
    private BigDecimal totalPriceMin;
    private BigDecimal totalPriceMax;
    private Color color;
    private int range = 256;
    private Set<Structure> structures;
    private Set<Feature> features;
    private Set<ClothType> clothTypes;

    public ClothFilter() {
    }

    public int getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public BigDecimal getPricePerMeterMin() {
        return pricePerMeterMin;
    }

    public void setPricePerMeterMin(BigDecimal pricePerMeterMin) {
        this.pricePerMeterMin = pricePerMeterMin;
    }

    public BigDecimal getPricePerMeterMax() {
        return pricePerMeterMax;
    }

    public void setPricePerMeterMax(BigDecimal pricePerMeterMax) {
        this.pricePerMeterMax = pricePerMeterMax;
    }

    public BigDecimal getTotalPriceMin() {
        return totalPriceMin;
    }

    public void setTotalPriceMin(BigDecimal totalPriceMin) {
        this.totalPriceMin = totalPriceMin;
    }

    public BigDecimal getTotalPriceMax() {
        return totalPriceMax;
    }

    public void setTotalPriceMax(BigDecimal totalPriceMax) {
        this.totalPriceMax = totalPriceMax;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Set<Structure> getStructures() {
        return structures;
    }

    public void setStructures(Set<Structure> structures) {
        this.structures = structures;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }

    public Set<ClothType> getClothTypes() {
        return clothTypes;
    }

    public void setClothTypes(Set<ClothType> clothTypes) {
        this.clothTypes = clothTypes;
    }
}
