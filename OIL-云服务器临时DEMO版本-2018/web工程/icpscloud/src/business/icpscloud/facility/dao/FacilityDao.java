/**
 * 
 */
package business.icpscloud.facility.dao;

import java.util.List;
import business.icpscloud.facility.entity.FacilityEntity;

/**
 * @author LiPeiXu
 * @ModifyDate 2017��6��20��
 */
public interface FacilityDao {
     FacilityEntity findById();
	// FacilityDataEntity findDevData(String id);
	 //List<FacilityDataEntity> findDevDataList(String id);

	/**
	 * @param index
	 * @param size
	 * @return
	 */
	List<FacilityEntity> findListByLimit(int index, int size);
}
