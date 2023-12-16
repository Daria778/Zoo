package Model.FileSystem;


import Model.Zoo.Zoo;

import java.io.*;


public class FileHandler<E> implements Workable<E>, Serializable{

    @Override
    public void fileWD(E h, String path) {
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(h.toString() + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fileWDToys(Zoo zoo) throws IOException {
        boolean flag = false;

        File file = new File("animals.data");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos!= null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(zoo);
                flag = true;
                System.out.println(zoo.getZoo().size());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (oos != null){
                oos.close();
            }
        }
    }

    @Override
    public Zoo fileRToys() {
        File file = new File("animals.data");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis!= null) {
                ois = new ObjectInputStream(fis);
                Zoo toy = (Zoo) ois.readObject();
                return toy;
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Something is wrong");
        } finally {
            try {
                ois.close();
            } catch (IOException e ) {
                System.out.println("Something is wrong");
            } catch (NullPointerException e){
                System.out.println("There are no animals");
            }
        }
            throw new RuntimeException("failed");
        }

        @Override
    public void fileR(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("There are no animals");;
        }
    }
}
