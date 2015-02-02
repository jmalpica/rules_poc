package com.barcelo.businessrules.model.api.dynamicpack;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * Root class of the fact tree that will represent all items whose price could be modified
 *
 * @author dag-vsf
 */
@Data
public class DynamicPackage {
	private String brand;
	private String channel;
	private String subChannel;
	private String managementGroup;
	private String agency;
	private String branchOffice;
	private Date bookingDate;
	private int bookingWeekday;
	private List<Traveller> travellerList;
	private List<ComponentDistribution> componentDistributionList;
}
