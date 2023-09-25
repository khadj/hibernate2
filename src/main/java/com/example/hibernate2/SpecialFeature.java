package com.example.hibernate2;

import lombok.Getter;

import static java.util.Objects.isNull;

@Getter
public enum SpecialFeature {
    TRAILERS("Trailers"),
    COMMENTARIES("Commentaries"),
    DELETED_SCENES("Deleted Scenes"),
    BEHIND_THE_SCENES("Behind the Scenes");

    private final String value;
    SpecialFeature(String value){
        this.value = value;
    }

    public static SpecialFeature getSpecialFeatureByValue(String value){
        if (isNull(value) || value.isEmpty()){
            return null;
        }
        
        SpecialFeature[] features = SpecialFeature.values();
        for (SpecialFeature feature : features) {
            if (feature.value.equals(value)) {
                return feature;
            }
        }
        return null;
    }
}
