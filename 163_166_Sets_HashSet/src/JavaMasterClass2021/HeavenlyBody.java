package JavaMasterClass2021;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites); //new HashSet - cannot make changes
    }


    @Override
    public boolean equals (Object obj){  //Overriding vs Overloading -> HeavenlyBody vs Object!
        if (this == obj){
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());

        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }


    @Override
    public int hashCode() {
        System.out.println("hashCode called");
//        return this.name.hashCode(); // not a good practice
        return this.name.hashCode() + 57; // number +57 small
    }

}
