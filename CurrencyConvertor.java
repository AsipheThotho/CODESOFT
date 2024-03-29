package currency_convertor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConvertor {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Exchange rates at the Date of 14 March 2024
        double usdToEur = 0.91423;
        double usdToGbp = 0.78146;
        double usdToJpy = 147.682;
        double usdToZar = 18.6285;
        
        double eurToGbp = 0.85471;
        double eurToJpy = 161.526;
        double eurToZar = 20.3735;
        
        double gbpToEur = 1.16979;
        double gbpToJpy = 188.962;
        double gbpToZar = 23.8344;
        
        double jpyToEur = 0.00619;
        double jpyToGbp = 0.00529;
        double jpyToZar = 0.12612;
        
        double zarToEur = 0.04905;
        double zarToGbp = 0.04192;
        double zarToJpy = 7.92287;
        
        boolean continuing = false;
        String continueInput;

        do {

        System.out.println("Currency Converter");
        System.out.println("------------------");
        System.out.println("Available currencies:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. JPY (Japanese Yen)");
        System.out.println("5. ZAR (South African Rand)");
        System.out.print("Select the base currency (curreny to convert from) (1/2/3/4/5): ");
        int sourceCurrency = scanner.nextInt();

        System.out.print("Enter the amount of the base currency: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0.0;
        String targetCurrencySymbol = "";
        
         DecimalFormat df = new DecimalFormat("#.##");

        switch (sourceCurrency) {
            case 1:
                System.out.println("\nAvailable target currencies:");
                System.out.println("2. EUR (Euro)");
                System.out.println("3. GBP (British Pound)");
                System.out.println("4. JPY (Japanese Yen)");
                System.out.println("5. ZAR (South African Rand)");
                System.out.print("Select the target currency(currency converting to) (2/3/4/5): ");
                System.out.println("");
                int targetCurrency = scanner.nextInt();
                
                if (targetCurrency == 2) {
                    convertedAmount = amount * usdToEur;
                    targetCurrencySymbol = "€";
                } else if (targetCurrency == 3) {
                    convertedAmount = amount * usdToGbp;
                    targetCurrencySymbol = "£";
                } else if (targetCurrency == 4) {
                    convertedAmount = amount * usdToJpy;
                    targetCurrencySymbol = "¥";
                } else if (targetCurrency == 5) {
                    convertedAmount = amount * usdToZar;
                    targetCurrencySymbol = "R";
                } else {
                    System.out.println("Invalid selection !!");
                }
                System.out.println("$ "+amount +" is equivalent to " +targetCurrencySymbol+" "+ df.format(convertedAmount));
                break;
            case 2:
                System.out.println("\nAvailable target currencies:");
                System.out.println("1. USD (US Dollar)");
                System.out.println("3. GBP (British Pound)");
                System.out.println("4. JPY (Japanese Yen)");
                System.out.println("5. ZAR (South African Rand)");
                System.out.print("Select the target currency(currency converting to) (2/3/4/5): ");
                System.out.println("");
                targetCurrency = scanner.nextInt();
                
                if (targetCurrency == 1) {
                    convertedAmount = amount / usdToEur;
                    targetCurrencySymbol = "$";
                } else if (targetCurrency == 3) {
                    convertedAmount = amount * eurToGbp;
                    targetCurrencySymbol = "£";
                } else if (targetCurrency == 4) {
                    convertedAmount = amount * eurToJpy;
                    targetCurrencySymbol = "¥";
                } else if (targetCurrency == 5) {
                    convertedAmount = amount * eurToZar;
                    targetCurrencySymbol = "R";
                } else {
                    System.out.println("Invalid selection !!");
                }
                System.out.println("€ "+amount +" is equivalent to " +targetCurrencySymbol+" "+ df.format(convertedAmount));
                break;
            case 3:
                System.out.println("\nAvailable target currencies:");
                System.out.println("1. USD (US Dollar)");
                System.out.println("2. EUR (Euro)");
                System.out.println("4. JPY (Japanese Yen)");
                System.out.println("5. ZAR (South African Rand)");
                System.out.print("Select the target currency(currency converting to) (2/3/4/5): ");
                System.out.println("");
                targetCurrency = scanner.nextInt();
                
                if (targetCurrency == 1) {
                    convertedAmount = amount / usdToGbp;
                    targetCurrencySymbol = "$";
                } else if (targetCurrency == 2) {
                    convertedAmount = amount * gbpToEur;
                    targetCurrencySymbol = "€";
                } else if (targetCurrency == 4) {
                    convertedAmount = amount * gbpToJpy;
                    targetCurrencySymbol = "¥";
                } else if (targetCurrency == 5) {
                    convertedAmount = amount * gbpToZar;
                    targetCurrencySymbol = "R";
                } else {
                    System.out.println("Invalid selection !!");
                }
                System.out.println("£ "+amount +" is equivalent to " +targetCurrencySymbol+" "+ df.format(convertedAmount));
                break;
            case 4:
                System.out.println("\nAvailable target currencies:");
                System.out.println("1. USD (US Dollar)");
                System.out.println("2. EUR (Euro)");
                System.out.println("3. GBP (British Pound)");
                System.out.println("5. ZAR (South African Rand)");
                System.out.print("Select the target currency(currency converting to) (2/3/4/5): ");
                System.out.println("");
                targetCurrency = scanner.nextInt();
                
                if (targetCurrency == 1) {
                    convertedAmount = amount / usdToJpy;
                    targetCurrencySymbol = "$";
                } else if (targetCurrency == 2) {
                    convertedAmount = amount * jpyToEur;
                    targetCurrencySymbol = "€";
                } else if (targetCurrency == 3) {
                    convertedAmount = amount * jpyToGbp;
                    targetCurrencySymbol = "£";
                } else if (targetCurrency == 5) {
                    convertedAmount = amount * jpyToZar;
                    targetCurrencySymbol = "R";
                } else {
                    System.out.println("Invalid selection !!");
                }
                System.out.println("¥ "+amount +" is equivalent to " +targetCurrencySymbol+" "+df.format(convertedAmount));
                break;
            case 5:
                System.out.println("\nAvailable target currencies:");
                System.out.println("1. USD (US Dollar)");
                System.out.println("2. EUR (Euro)");
                System.out.println("3. GBP (British Pound)");
                System.out.println("4. JPY (Japanese Yen)");
                System.out.print("Select the target currency(currency converting to) (2/3/4/5): ");
                System.out.println("");
                targetCurrency = scanner.nextInt();
                
                if (targetCurrency == 1) {
                    convertedAmount = amount / usdToZar;
                    targetCurrencySymbol = "$";
                } else if (targetCurrency == 2) {
                    convertedAmount = amount * zarToEur;
                    targetCurrencySymbol = "€";
                } else if (targetCurrency == 3) {
                    convertedAmount = amount * zarToGbp;
                    targetCurrencySymbol = "£";
                } else if (targetCurrency == 4) {
                    convertedAmount = amount * zarToJpy;
                    targetCurrencySymbol = "¥";
                } else {
                    System.out.println("Invalid selection !!");
                }
                System.out.println("R "+amount +" is equivalent to " +targetCurrencySymbol+" "+ df.format(convertedAmount));
                
                break;
            default:
                System.out.println("Invalid selection !!");
                break;
        }
        
        System.out.print("Do you want to continue ? (yes/no): ");
        continueInput = scanner.next().toLowerCase();
        continuing = continueInput.equals("yes") || continueInput.equals("ye")|| continueInput.equals("y");
        
        } while (continuing);
    }
}