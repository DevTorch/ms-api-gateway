package springcloudms.apigateway.utils;

public enum ServiceLocations {

    PRODUCT_SERVICE("lb://product-service"),
    ORDER_SERVICE("lb://order-service"),
    INVENTORY_SERVICE("lb://inventory-service"),
    AUTH_SERVICE("lb://auth-service");

    private final String uri;

    ServiceLocations(String uri) {
        this.uri = uri;
    }
    public String getUri() {
        return uri;
    }
}