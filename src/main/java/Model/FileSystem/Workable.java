package Model.FileSystem;

import Model.Zoo.Zoo;

import java.io.IOException;

public interface Workable<E> {
    void fileWD(E h, String path) throws IOException;
    void fileWDToys(Zoo t) throws IOException;
    void fileR(String path) throws IOException, ClassNotFoundException;
    Zoo fileRToys() throws IOException, ClassNotFoundException;


}
