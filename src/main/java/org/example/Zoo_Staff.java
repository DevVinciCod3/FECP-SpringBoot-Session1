package org.example;

public class Zoo_Staff {
    private String manager, veterinarian;
    private String pachydermHandler, felineHandler, birdHandler;
    private String ticketVendor, shopVendor;

    public void setManager(String name) { this.manager = name; }
    public void setVeterinarian(String name) { this.veterinarian = name; }
    public void setPachydermHandler(String name) { this.pachydermHandler = name; }
    public void setFelineHandler(String name) { this.felineHandler = name; }
    public void setBirdHandler(String name) { this.birdHandler = name; }
    public void setTicketVendor(String name) { this.ticketVendor = name; }
    public void setShopVendor(String name) { this.shopVendor = name; }

    public String getFelineHandler() { return felineHandler; }
    public String getPachydermHandler() { return pachydermHandler; }
    public String getBirdHandler() { return birdHandler; }
}
