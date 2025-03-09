class OrganicWasteCollector extends WasteCollector {

    public void collectWaste(WasteContainer container) {

        if (container.getType().equalsIgnoreCase("organic") && container.isFull()) {

            System.out.println("Collecting organic waste. Disposing...");

        } else {

            super.collectWaste(container);
            
        }
    }
}