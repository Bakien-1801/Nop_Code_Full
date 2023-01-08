package Hw6.Ex_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];

        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getPopulation() > newArray[inLoop2].getPopulation()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }

        // show list

        /*
         * TODO *
         * 
         */
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getPopulation() < newArray[inLoop2].getPopulation()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getArea() > newArray[inLoop2].getArea()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getArea() < newArray[inLoop2].getArea()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getGdp() > newArray[inLoop2].getGdp()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }
        /* TODO */

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int inLoop1 = 0; inLoop1 < newArray.length; inLoop1++) {
            for (int inLoop2 = 1; inLoop2 < newArray.length - inLoop1; inLoop2++) {

                if (newArray[inLoop2 - 1].getGdp() < newArray[inLoop2].getGdp()) {
                    Country temp = newArray[inLoop2 - 1];
                    newArray[inLoop2 - 1] = newArray[inLoop2];
                    newArray[inLoop2] = temp;
                }

            }
        }
        /* TODO */

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        int n = 0;
        AfricaCountry[] arrays = new AfricaCountry[n];

        return arrays;

        /* TODO */
    }

    public AsiaCountry[] filterAsiaCountry() {
        int n = 0;
        AsiaCountry[] result = new AsiaCountry[n];
        return result;
        /* TODO */
    }

    public EuropeCountry[] filterEuropeCountry() {
        int n = 0;
        EuropeCountry[] result = new EuropeCountry[n];
        return result;

        /* TODO */
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        int n = 0;
        NorthAmericaCountry[] result = new NorthAmericaCountry[n];
        return result;
        /* TODO */
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        int n = 0;
        OceaniaCountry[] result = new OceaniaCountry[n];
        return result;
        /* TODO */
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        int n = 0;
        SouthAmericaCountry[] result = new SouthAmericaCountry[n];
        return result;
        /* TODO */
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getPopulation() < newArray[j + 1].getPopulation()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        Country[] result = new Country[howMany];
        System.arraycopy(newArray, 0, result, 0, howMany);
        return result;
        /* TODO */
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getPopulation() > newArray[j + 1].getPopulation()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        Country[] result = new Country[howMany];
        System.arraycopy(newArray, 0, result, 0, howMany);
        return result;
        /* TODO */
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        Country[] result = new Country[howMany];
        System.arraycopy(newArray, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        Country[] result = new Country[howMany];
        System.arraycopy(newArray, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getGdp() < newArray[j + 1].getGdp()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        Country[] result = new Country[howMany];
        System.arraycopy(newArray, 0, result, 0, howMany);
        return result;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getGdp() > newArray[j + 1].getGdp()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        Country[] result = new Country[howMany];
        System.arraycopy(newArray, 0, result, 0, howMany);
        return result;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
