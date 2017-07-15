package core;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 
 */

/**
 * @author Dhananjay P
 *
 */
public class CollectionSample {
	
	Set<String> set=new HashSet<>();
	
	List<String> list= new ArrayList<>();
	
	Map<String,String> map=new HashMap<>();
	
	Properties props=new Properties();

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CollectionSample [\nset=" + set + "\n, list=" + list + "\n, map=" + map + ", \nprops=" + props + "]";
	}

	/**
	 * @return the set
	 */
	public Set<String> getSet() {
		return set;
	}

	/**
	 * @param set the set to set
	 */
	public void setSet(Set<String> set) {
		this.set = set;
	}

	/**
	 * @return the list
	 */
	public List<String> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<String> list) {
		this.list = list;
	}

	/**
	 * @return the map
	 */
	public Map<String, String> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	/**
	 * @return the props
	 */
	public Properties getProps() {
		return props;
	}

	/**
	 * @param props the props to set
	 */
	public void setProps(Properties props) {
		this.props = props;
	}
	
	

}
