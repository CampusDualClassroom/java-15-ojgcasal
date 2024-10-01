package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;

    // Constructor que incluye la fecha de caducidad
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }
    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    @Override
    public String getSpecificData() {
        String formattedDate = getFormattedDate(expirationDate);

        StringBuilder details = new StringBuilder();
        details.append("Localización: ").append(getLocation()).append("\n");
        details.append("Fecha de caducidad: ").append(formattedDate);

        return details.toString();
    }
    public void printSpecificData() {
        System.out.println(getSpecificData());
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}
