package Tasks.Rush;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class ReadAndWrite {
    public static void main(String[] args) {
       try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();

            User user = new User();
            user.setFirstName("Tom");
            user.setLastName("Suworof");
            user.setCountry(User.Country.UKRAINE);
            user.setMale(true);
            user.setBirthDate(new Date(0L));

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            System.out.println(javaRush.equals(loadedObject));
            System.out.println(loadedObject.users.get(0).getCountry().getDisplayName());

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public ArrayList<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) {
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream));
            if (users != null) {
                for (User user : users) {
                    writer.println(user.getFirstName());
                    writer.println(user.getLastName());
                    writer.println(user.getBirthDate());
                    writer.println(user.isMale());
                    writer.println(user.getCountry());
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                users.add(new User());
                users.get(users.size() - 1).setFirstName(reader.readLine());
                users.get(users.size() - 1).setLastName(reader.readLine());
                users.get(users.size() - 1).setBirthDate(new Date(Long.parseLong(reader.readLine())));
                users.get(users.size() - 1).setMale(Boolean.parseBoolean(reader.readLine()));
                User.Country country = null;
                switch (reader.readLine()) {
                    case "Ukraine":
                        country = User.Country.UKRAINE;
                        break;
                    case "Russia":
                        country = User.Country.RUSSIA;
                        break;
                    case "Other":
                        country = User.Country.OTHER;
                        break;
                    default:
                        break;
                }
                users.get(users.size() - 1).setCountry(country);
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return Objects.equals(users, javaRush.users);

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}


class User {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private boolean isMale;
    private Country country;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public enum Country {
        UKRAINE("Ukraine"),
        RUSSIA("Russia"),
        OTHER("Other");

        final private String name;

        Country(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return this.name;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (isMale != user.isMale) return false;
        if (!Objects.equals(firstName, user.firstName)) return false;
        if (!Objects.equals(lastName, user.lastName)) return false;
        if (!Objects.equals(birthDate, user.birthDate)) return false;
        return country == user.country;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (isMale ? 1 : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}