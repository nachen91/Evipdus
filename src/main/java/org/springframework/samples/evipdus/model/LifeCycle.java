package org.springframework.samples.evipdus.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name = "ciclodevida")
public class LifeCycle extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "No debe estar vacio")
	private String dataCaptureAP;
	
	@NotBlank(message = "No debe estar vacio")
	private String dataCaptureDT;
	
	@NotBlank(message = "No debe estar vacio")
	private String dataCaptureII;
	
	@NotBlank(message = "No debe estar vacio")
	private String dataCaptureTI;
	
	@NotBlank(message = "No debe estar vacio")
	private String storageAP;
	
	@NotBlank(message = "No debe estar vacio")
	private String storageDT;
	
	@NotBlank(message = "No debe estar vacio")
	private String storageII;
	
	@NotBlank(message = "No debe estar vacio")
	private String storageTI;
	
	
	@NotBlank(message = "No debe estar vacio")
	private String treatmentAP;
	
	@NotBlank(message = "No debe estar vacio")
	private String treatmentDT;
	
	@NotBlank(message = "No debe estar vacio")
	private String treatmentII;
	
	@NotBlank(message = "No debe estar vacio")
	private String treatmentTI;
	
	
	@NotBlank(message = "No debe estar vacio")
	private String dataAssigmentTransferAP;
	
	@NotBlank(message = "No debe estar vacio")
	private String dataAssigmentTransferDT;
	
	@NotBlank(message = "No debe estar vacio")
	private String dataAssigmentTransferII;
	
	@NotBlank(message = "No debe estar vacio")
	private String dataAssigmentTransferTI;
	
	@NotBlank(message = "No debe estar vacio")
	private String destructionAP;
	
	@NotBlank(message = "No debe estar vacio")
	private String destructionDT;
	
	@NotBlank(message = "No debe estar vacio")
	private String destructionII;
	
	@NotBlank(message = "No debe estar vacio")
	private String destructionTI;
	
	
	
	private String interested;
	
	
	private String treatmentResponsible;
	
	
	private String treatmentManager;
	
	
	private String thirdparties;

	
	private String systemDescription;
	
	
	private String dataFlowSystem;
	
	private String ProdSerByDataProcess;
	
	private String informationProc;
	
	private String consecProc;
	
	private String exerciseProc;
	
	private String medsecurity;
	
	private String interTransfer;
	
	public String getDataCaptureAP() {
		return dataCaptureAP;
	}

	public void setDataCaptureAP(String dataCaptureAP) {
		this.dataCaptureAP = dataCaptureAP;
	}

	public String getDataCaptureDT() {
		return dataCaptureDT;
	}

	public void setDataCaptureDT(String dataCaptureDT) {
		this.dataCaptureDT = dataCaptureDT;
	}

	public String getDataCaptureII() {
		return dataCaptureII;
	}

	public void setDataCaptureII(String dataCaptureII) {
		this.dataCaptureII = dataCaptureII;
	}

	public String getDataCaptureTI() {
		return dataCaptureTI;
	}

	public void setDataCaptureTI(String dataCaptureTI) {
		this.dataCaptureTI = dataCaptureTI;
	}

	public String getStorageAP() {
		return storageAP;
	}

	public void setStorageAP(String storageAP) {
		this.storageAP = storageAP;
	}

	public String getStorageDT() {
		return storageDT;
	}

	public void setStorageDT(String storageDT) {
		this.storageDT = storageDT;
	}

	public String getStorageII() {
		return storageII;
	}

	public void setStorageII(String storageII) {
		this.storageII = storageII;
	}

	public String getStorageTI() {
		return storageTI;
	}

	public void setStorageTI(String storageTI) {
		this.storageTI = storageTI;
	}

	public String getTreatmentAP() {
		return treatmentAP;
	}

	public void setTreatmentAP(String treatmentAP) {
		this.treatmentAP = treatmentAP;
	}

	public String getTreatmentDT() {
		return treatmentDT;
	}

	public void setTreatmentDT(String treatmentDT) {
		this.treatmentDT = treatmentDT;
	}

	public String getTreatmentII() {
		return treatmentII;
	}

	public void setTreatmentII(String treatmentII) {
		this.treatmentII = treatmentII;
	}

	public String getTreatmentTI() {
		return treatmentTI;
	}

	public void setTreatmentTI(String treatmentTI) {
		this.treatmentTI = treatmentTI;
	}

	public String getDataAssigmentTransferAP() {
		return dataAssigmentTransferAP;
	}

	public void setDataAssigmentTransferAP(String dataAssigmentTransferAP) {
		this.dataAssigmentTransferAP = dataAssigmentTransferAP;
	}

	public String getDataAssigmentTransferDT() {
		return dataAssigmentTransferDT;
	}

	public void setDataAssigmentTransferDT(String dataAssigmentTransferDT) {
		this.dataAssigmentTransferDT = dataAssigmentTransferDT;
	}

	public String getDataAssigmentTransferII() {
		return dataAssigmentTransferII;
	}

	public void setDataAssigmentTransferII(String dataAssigmentTransferII) {
		this.dataAssigmentTransferII = dataAssigmentTransferII;
	}

	public String getDataAssigmentTransferTI() {
		return dataAssigmentTransferTI;
	}

	public void setDataAssigmentTransferTI(String dataAssigmentTransferTI) {
		this.dataAssigmentTransferTI = dataAssigmentTransferTI;
	}

	public String getDestructionAP() {
		return destructionAP;
	}

	public void setDestructionAP(String destructionAP) {
		this.destructionAP = destructionAP;
	}

	public String getDestructionDT() {
		return destructionDT;
	}

	public void setDestructionDT(String destructionDT) {
		this.destructionDT = destructionDT;
	}

	public String getDestructionII() {
		return destructionII;
	}

	public void setDestructionII(String destructionII) {
		this.destructionII = destructionII;
	}

	public String getDestructionTI() {
		return destructionTI;
	}

	public void setDestructionTI(String destructionTI) {
		this.destructionTI = destructionTI;
	}

	public String getDataFlowSystem() {
		return dataFlowSystem;
	}

	public void setDataFlowSystem(String dataFlowSystem) {
		this.dataFlowSystem = dataFlowSystem;
	}

	public String getProdSerByDataProcess() {
		return ProdSerByDataProcess;
	}

	public void setProdSerByDataProcess(String prodSerByDataProcess) {
		ProdSerByDataProcess = prodSerByDataProcess;
	}

	public String getInformationProc() {
		return informationProc;
	}

	public void setInformationProc(String informationProc) {
		this.informationProc = informationProc;
	}

	public String getConsecProc() {
		return consecProc;
	}

	public void setConsecProc(String consecProc) {
		this.consecProc = consecProc;
	}

	public String getExerciseProc() {
		return exerciseProc;
	}

	public void setExerciseProc(String exerciseProc) {
		this.exerciseProc = exerciseProc;
	}

	public String getMedsecurity() {
		return medsecurity;
	}

	public void setMedsecurity(String medsecurity) {
		this.medsecurity = medsecurity;
	}

	public String getInterTransfer() {
		return interTransfer;
	}

	public void setInterTransfer(String interTransfer) {
		this.interTransfer = interTransfer;
	}

	public String getDataAssigmentTransfer() {
		return dataAssigmentTransferAP;
	}

	public void setDataAssigmentTransfer(String dataAssigmentTransfer) {
		this.dataAssigmentTransferAP = dataAssigmentTransfer;
	}

	public String getInterested() {
		return interested;
	}

	public void setInterested(String interested) {
		this.interested = interested;
	}

	public String getTreatmentResponsible() {
		return treatmentResponsible;
	}

	public void setTreatmentResponsible(String treatmentResponsible) {
		this.treatmentResponsible = treatmentResponsible;
	}

	public String getTreatmentManager() {
		return treatmentManager;
	}

	public void setTreatmentManager(String treatmentManager) {
		this.treatmentManager = treatmentManager;
	}

	public String getThirdparties() {
		return thirdparties;
	}

	public void setThirdparties(String thirdparties) {
		this.thirdparties = thirdparties;
	}

	public String getSystemDescription() {
		return systemDescription;
	}

	public void setSystemDescription(String systemDescription) {
		this.systemDescription = systemDescription;
	}

	public String getDataFlow() {
		return dataFlow;
	}

	public void setDataFlow(String dataFlow) {
		this.dataFlow = dataFlow;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProductDataProcess() {
		return productDataProcess;
	}

	public void setProductDataProcess(String productDataProcess) {
		this.productDataProcess = productDataProcess;
	}

	private String dataTransfer;
	
	
	private String dataFlow;

	
	private String product;
	
	@NotBlank(message = "No debe estar vacio")
	private String productDataProcess;
	
	public String getDataCapture() {
		return dataCaptureAP;
	}

	public void setDataCapture(String dataCapture) {
		this.dataCaptureAP = dataCapture;
	}

	public String getStorage() {
		return storageAP;
	}

	public void setStorage(String storage) {
		this.storageAP = storage;
	}

	public String getTreatment() {
		return treatmentAP;
	}

	public void setTreatment(String treatment) {
		this.treatmentAP = treatment;
	}

	public String getDataTransfer() {
		return dataTransfer;
	}

	public void setDataTransfer(String dataTransfer) {
		this.dataTransfer = dataTransfer;
	}
	
}
