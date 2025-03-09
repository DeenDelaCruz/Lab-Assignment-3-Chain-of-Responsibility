class HazardousWasteCollector extends WasteCollector {

    public void collectWaste(WasteContainer container) {

        if (container.getType().equalsIgnoreCase("hazardous") && container.isFull()) {

            System.out.println("Handling hazardous waste with caution. Disposing...");
            
        } else {

            super.collectWaste(container);

        }
    }
}