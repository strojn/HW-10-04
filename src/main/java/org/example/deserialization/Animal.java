package org.example.deserialization;

import java.io.Serializable;

/**
 *
 * private;
 * protected;
 * default (package visible); //package private
 * public.
 *
 */
public class Animal implements Serializable {
    String stringDefault;
    public String stringPublic;
    protected String stringProtected;
    public Animal(String stringDefault, String stringPublic, String stringProtected) {
        this.stringDefault = stringDefault;
        this.stringPublic = stringPublic;
        this.stringProtected = stringProtected;
    }
    final String stringFinal = "stringFinal";
    public static String stringPublicStatic;
    public static final String stringPublicStaticFinal = "stringPublicStaticFinal";
    private static String stringPrivateStatic;
    private static final String stringPrivateStaticFinal = "stringPrivateStaticFinal";
    public static void setStringPrivateStatic(String stringPrivateStatic) {
        Animal.stringPrivateStatic = stringPrivateStatic;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "\n\tstringDefault='" + stringDefault + '\'' +
                ", \n\tstringPublic='" + stringPublic + '\'' +
                ", \n\tstringProtected='" + stringProtected + '\'' +

                ", \n\tstringFinal='" + stringFinal + '\'' +
                ", \n\tstringPublicStatic='" + stringPublicStatic + '\'' +
                ", \n\tstringPublicStaticFinal='" + stringPublicStaticFinal + '\'' +
                ", \n\tstringPrivateStatic='" + stringPrivateStatic + '\'' +
                ", \n\tstringPrivateStaticFinal='" + stringPrivateStaticFinal + '\'' +
                '}';
    }
}