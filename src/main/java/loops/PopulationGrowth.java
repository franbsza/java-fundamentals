/*
Determine how many years is necessary to population A exceeds the population B
according to its tax of growth , respectively
 */
package loops;

public class PopulationGrowth {

    public int calcGrowth(double populationA, double populationB, double taxGrowthA, double taxGrowthB){

        int years = 0;
        do{
            populationA = populationA * taxGrowthA;
            populationB = populationB * taxGrowthB;
            years++;

        }while (populationA < populationB);

        return years;
    }
}
