/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class brands {
    private int id;
    private String brandName;
    private int supplierId;
    private LocalDateTime createdAt;
    private int createdBy;
    private LocalDateTime updatedAt;
    private int updatedBy;
    
    public brands(String brandName, int supplierId, LocalDateTime createdAt, int createdBy,  LocalDateTime updatedAt, int updatedBy){
        this.brandName=brandName;
        this.supplierId=supplierId;
        this.createdAt=createdAt;
        this.createdBy=createdBy;
        this.updatedAt=updatedAt;
        this.updatedBy=updatedBy;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(String brandName){
        this.brandName=brandName;
    }
    public int getSupplierId(){
        return supplierId;
    }
    public void setSupplierId(int supplierId){
        this.supplierId=supplierId;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public int getCreatedBy(){
        return createdBy;
    }
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
    public LocalDateTime getUpdatedAt(){
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public int getUpdatedBy(){
        return updatedBy;
    }
    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
}
