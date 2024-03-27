package za.ac.cput.repository;
import za.ac.cput.domain.Insurance;
import java.util.HashSet;
import java.util.Set;

/*
 * Insurance.java
 * Repository
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 23 March 2024.
 */

public class InsuranceRepository implements IInsuranceRepository{
    private static InsuranceRepository insuranceRepo = null;
    private Set <Insurance> insuranceDB;

    //Constructor
    private InsuranceRepository(){
        insuranceDB = new HashSet<Insurance>();
    }

    //Test, repository if it does exist or not.
    public static InsuranceRepository getInsuranceRepo(){
        if(insuranceRepo == null){
            insuranceRepo = new InsuranceRepository();
        }
        return insuranceRepo;
    }
    //Create, Read, Update, and Delete functions.
    @Override
    public Insurance create(Insurance insurance){
        boolean success = insuranceDB.add(insurance);
        if(!success){
            return null;
        }
        return insurance;
    }
    @Override
    public Insurance read(String insuranceID){
        for(Insurance readInsurance: insuranceDB){
            if(readInsurance.getInsuranceID().equals(insuranceID)){
                return readInsurance;
            }
        }
        return null;
    }
    @Override
    public Insurance update(Insurance insurance){
        Insurance oldInsurance = read(insurance.getInsuranceID());
        if(oldInsurance != null){
            insuranceDB.remove(oldInsurance);
            insuranceDB.add(insurance);
            return insurance;
        }
        return null;
    }
    @Override
    public boolean delete(String insuranceID){
        Insurance deleteInsurance = read(insuranceID);
        if(deleteInsurance == null){
            return false;
        }
        insuranceDB.remove(deleteInsurance);
        return true;
    }
    @Override
    public Set<Insurance> getAll() {
        return insuranceDB;
    }
}
