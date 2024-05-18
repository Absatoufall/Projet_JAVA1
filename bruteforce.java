import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class bruteforce {
    public static void main(String[] args) {
        bruteForce(3); 
    }

 
    public static String bruteForce(int size) {
        int[] password = new int[size]; 
        String pass = "0ce28cdc1cca8132e6c1cd12fa383e0ea36272f6dd42323461d95731efa65523"; 
        return computePermutations(size, password, 0, pass); 
    }

    
    private static String computePermutations(int size, int[] password, int position, String pass) {
        String assemble = ""; 

        
        for (int i = 0; i < 36; i++) {
            password[position] = i; 

            
            if (position != size - 1) {
                
                String testString = computePermutations(size, password, position + 1, pass);
                
                if (!testString.isEmpty()) {
                    return testString;
                }
            } else if (position == size - 1) { 
                
                for (int j = 0; j < size; j++) {
                    assemble += getChar(password[j]);
                }

                
                String hashedPassword = hashPassword(assemble);

                System.out.println(hashedPassword); 
        
                if (hashedPassword.equals(pass)) {
                    System.out.println("Le mot de passe est : " + assemble); 
                    return assemble; 
                }
            }
        }
        return ""; 
    }

    
    private static char getChar(int value) {
        if (value >= 0 && value <= 25) {
            return (char) ('A' + value); 
        } else {
            return (char) ('0' + value - 26); 
        }
    }

    
    private static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString(); 
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
