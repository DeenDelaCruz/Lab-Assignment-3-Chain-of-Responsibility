class RecyclableWasteCollector extends WasteCollector {

    public void collectWaste(WasteContainer container) {

        if (container.getType().equalsIgnoreCase("recyclable") && container.isFull()) {

            System.out.println("Collecting recyclable waste. Separating from other wastes...");

        } else {

            super.collectWaste(container);
            
        }
    }
}