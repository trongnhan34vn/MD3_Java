package guitarplus.impl;

import guitarplus.data.DataURL;
import guitarplus.design.IController;
import guitarplus.entity.User;
import guitarplus.config.Config.*;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static guitarplus.config.Config.scanner;

public class UsersImpl implements IController<User, Integer> {

    @Override
    public boolean create(User newUser) {
        List<User> listUsers = readFromFile();
        if (listUsers == null) {
            listUsers = new ArrayList<>();
        }
        listUsers.add(newUser);
        return writeToFile(listUsers);
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public List<User> readFromFile() {
        List<User> list = new ArrayList<>();
        File file;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            file = new File(DataURL.URL_USER_FILE);
            if (file.exists()) {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                list = (List<User>) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public boolean writeToFile(List<User> list) {
        File file = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        boolean writeSuccess = true;
        try {
            file = new File(DataURL.URL_USER_FILE);
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (IOException ex) {
            writeSuccess = false;
            ex.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return writeSuccess;
    }

    @Override
    public User inputData() {
        User newUser = new User();
        List<User> listUsers = readFromFile();
        if (listUsers == null) {
            newUser.setUserId(1);
        } else {
            newUser.setUserId(listUsers.get(listUsers.size() - 1).getUserId() + 1);
        }
        System.out.println("Username: ");
        newUser.setUserName(scanner.nextLine());
        System.out.println("Password: ");
        newUser.setPassword(scanner.nextLine());
        System.out.println("Fullname: ");
        newUser.setFullName(scanner.nextLine());
        newUser.setPermission(false);
        newUser.setUserStatus(true);
        return newUser;
    }

    @Override
    public void displayData() {

    }

    public User checkLogin(String userName, String password) {
        List<User> list = readFromFile();
        if (list == null) {
            list = new ArrayList<>();
        }
        for (User user : list) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
