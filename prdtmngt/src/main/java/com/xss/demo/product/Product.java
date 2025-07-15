package com.xss.demo.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long productId;
        
        private String name;
        
        private String description;
        
        private Double price;
        
        private int quantity;
        
        private String userId;
        
        public Product(){}
        
        public Product(String name,
                        String description, Double price,
                        int quantity, String userId) {
                this.name = name;
                this.description = description;
                this.price = price;
                this.quantity = quantity;
                this.userId = userId;
        }
        
        public long getProductId() {
                return productId;
        }
        public void setProductId(long productId) {
                this.productId = productId;
        }
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public String getDescription() {
                return description;
        }
        public void setDescription(String description) {
                this.description = description;
        }
        public Double getPrice() {
                return price;
        }
        public void setPrice(Double price) {
                this.price = price;
        }
        public int getQuantity() {
                return quantity;
        }
        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }
        public String getUserId() {
                return userId;
        }
        public void setUserId(String userId) {
                this.userId = userId;
        }

        @Override
        public String toString() {
                return "Product [productId=" + productId + ", name="
                                + name + ", description="
                                + description + ", price=" + price
                                + ", quantity=" + quantity
                                + ", userId=" + userId + "]";
        }

}