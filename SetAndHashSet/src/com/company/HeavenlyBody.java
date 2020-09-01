package com.company;

import java.util.HashSet;
import java.util.Set;

//public final class HeavenlyBody {
public abstract class HeavenlyBody {

//    private final String name;
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
//    private final BodyTypes bodyType;

//    public static final int STAR = 1;
//    public static final int PLANET = 2;
//    public static final int DWARF_PLANET = 3;
//    public static final int MOON = 4;
//    public static final int COMET = 5;
//    public static final int ASTEROID = 6;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
//        this.name = name;
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
//        this.bodyType = bodyType;
    }

//    public String getName() {
//        return name;
//    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    //    public BodyTypes getBodyType() {
//        return bodyType;
//    }

    public boolean addSatellite(HeavenlyBody moon){
       return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

//    @Override
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//        System.out.println("obj.getClass() is: " + obj.getClass());
//        System.out.println("this.getClass() is: " + this.getClass());
//
//        if((obj == null) || obj.getClass() != this.getClass()){
//            return false;
//        }
//
//        String objName = ((HeavenlyBody) obj).getName();
//        return this.name.equals(objName);
//    }

    @Override
    public final boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
//            if(this.name.equals(theObject.getName())){
//                return theObject.bodyType == theObject.bodyType;
//            }
            return theObject.key.equals(theObject.getKey());
        }

        return false;
    }

    @Override
    public final int hashCode() {
//        return super.hashCode();
//        System.out.println("hashCode() called!!!!!!");
//        return this.name.hashCode() + 57 +this.bodyType.hashCode();
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key{

        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())){
                return (this.bodyType == key.bodyType);
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
