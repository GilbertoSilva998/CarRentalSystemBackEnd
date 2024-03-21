package za.ac.cput.repository;

/*
 * IRepository.Java
 * @author: Gilberto Silva (218239300)
 * Date: 21 March 2024
 * */

public interface IRepository <T, ID>{
    T create (T t);
    T read (ID id);
    T update (T t);
    boolean delete (ID id);
}
