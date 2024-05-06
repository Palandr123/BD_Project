// ORM class for table 'police_dept_incident_reports'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon May 06 12:06:26 MSK 2024
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class police_dept_incident_reports extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("incident_datetime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_datetime = (java.sql.Date)value;
      }
    });
    setters.put("incident_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_date = (java.sql.Date)value;
      }
    });
    setters.put("incident_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_time = (String)value;
      }
    });
    setters.put("incident_year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_year = (Integer)value;
      }
    });
    setters.put("incident_dow", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_dow = (String)value;
      }
    });
    setters.put("report_datetime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.report_datetime = (java.sql.Date)value;
      }
    });
    setters.put("row_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.row_id = (Long)value;
      }
    });
    setters.put("incident_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_id = (Integer)value;
      }
    });
    setters.put("incident_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_number = (Integer)value;
      }
    });
    setters.put("cad_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.cad_number = (Integer)value;
      }
    });
    setters.put("report_type_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.report_type_code = (String)value;
      }
    });
    setters.put("report_type_description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.report_type_description = (String)value;
      }
    });
    setters.put("filled_online", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.filled_online = (Boolean)value;
      }
    });
    setters.put("incident_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_code = (Integer)value;
      }
    });
    setters.put("incident_category", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_category = (String)value;
      }
    });
    setters.put("incident_subcategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_subcategory = (String)value;
      }
    });
    setters.put("incident_descr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.incident_descr = (String)value;
      }
    });
    setters.put("resolution", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.resolution = (String)value;
      }
    });
    setters.put("intersection", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.intersection = (String)value;
      }
    });
    setters.put("cnn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.cnn = (Integer)value;
      }
    });
    setters.put("police_district", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.police_district = (String)value;
      }
    });
    setters.put("analysis_neigh", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.analysis_neigh = (String)value;
      }
    });
    setters.put("supervisor_distr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.supervisor_distr = (Integer)value;
      }
    });
    setters.put("supervisor_distr_2012", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.supervisor_distr_2012 = (Integer)value;
      }
    });
    setters.put("latitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.latitude = (Double)value;
      }
    });
    setters.put("longitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.longitude = (Double)value;
      }
    });
    setters.put("datapoint", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.datapoint = (String)value;
      }
    });
    setters.put("neighbourhoods", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.neighbourhoods = (Integer)value;
      }
    });
    setters.put("esncag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.esncag = (Integer)value;
      }
    });
    setters.put("cm_polygon", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.cm_polygon = (Integer)value;
      }
    });
    setters.put("cchr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.cchr = (Integer)value;
      }
    });
    setters.put("hsoc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.hsoc = (Integer)value;
      }
    });
    setters.put("iin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.iin = (Integer)value;
      }
    });
    setters.put("csd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.csd = (Integer)value;
      }
    });
    setters.put("cpd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        police_dept_incident_reports.this.cpd = (Integer)value;
      }
    });
  }
  public police_dept_incident_reports() {
    init0();
  }
  private java.sql.Date incident_datetime;
  public java.sql.Date get_incident_datetime() {
    return incident_datetime;
  }
  public void set_incident_datetime(java.sql.Date incident_datetime) {
    this.incident_datetime = incident_datetime;
  }
  public police_dept_incident_reports with_incident_datetime(java.sql.Date incident_datetime) {
    this.incident_datetime = incident_datetime;
    return this;
  }
  private java.sql.Date incident_date;
  public java.sql.Date get_incident_date() {
    return incident_date;
  }
  public void set_incident_date(java.sql.Date incident_date) {
    this.incident_date = incident_date;
  }
  public police_dept_incident_reports with_incident_date(java.sql.Date incident_date) {
    this.incident_date = incident_date;
    return this;
  }
  private String incident_time;
  public String get_incident_time() {
    return incident_time;
  }
  public void set_incident_time(String incident_time) {
    this.incident_time = incident_time;
  }
  public police_dept_incident_reports with_incident_time(String incident_time) {
    this.incident_time = incident_time;
    return this;
  }
  private Integer incident_year;
  public Integer get_incident_year() {
    return incident_year;
  }
  public void set_incident_year(Integer incident_year) {
    this.incident_year = incident_year;
  }
  public police_dept_incident_reports with_incident_year(Integer incident_year) {
    this.incident_year = incident_year;
    return this;
  }
  private String incident_dow;
  public String get_incident_dow() {
    return incident_dow;
  }
  public void set_incident_dow(String incident_dow) {
    this.incident_dow = incident_dow;
  }
  public police_dept_incident_reports with_incident_dow(String incident_dow) {
    this.incident_dow = incident_dow;
    return this;
  }
  private java.sql.Date report_datetime;
  public java.sql.Date get_report_datetime() {
    return report_datetime;
  }
  public void set_report_datetime(java.sql.Date report_datetime) {
    this.report_datetime = report_datetime;
  }
  public police_dept_incident_reports with_report_datetime(java.sql.Date report_datetime) {
    this.report_datetime = report_datetime;
    return this;
  }
  private Long row_id;
  public Long get_row_id() {
    return row_id;
  }
  public void set_row_id(Long row_id) {
    this.row_id = row_id;
  }
  public police_dept_incident_reports with_row_id(Long row_id) {
    this.row_id = row_id;
    return this;
  }
  private Integer incident_id;
  public Integer get_incident_id() {
    return incident_id;
  }
  public void set_incident_id(Integer incident_id) {
    this.incident_id = incident_id;
  }
  public police_dept_incident_reports with_incident_id(Integer incident_id) {
    this.incident_id = incident_id;
    return this;
  }
  private Integer incident_number;
  public Integer get_incident_number() {
    return incident_number;
  }
  public void set_incident_number(Integer incident_number) {
    this.incident_number = incident_number;
  }
  public police_dept_incident_reports with_incident_number(Integer incident_number) {
    this.incident_number = incident_number;
    return this;
  }
  private Integer cad_number;
  public Integer get_cad_number() {
    return cad_number;
  }
  public void set_cad_number(Integer cad_number) {
    this.cad_number = cad_number;
  }
  public police_dept_incident_reports with_cad_number(Integer cad_number) {
    this.cad_number = cad_number;
    return this;
  }
  private String report_type_code;
  public String get_report_type_code() {
    return report_type_code;
  }
  public void set_report_type_code(String report_type_code) {
    this.report_type_code = report_type_code;
  }
  public police_dept_incident_reports with_report_type_code(String report_type_code) {
    this.report_type_code = report_type_code;
    return this;
  }
  private String report_type_description;
  public String get_report_type_description() {
    return report_type_description;
  }
  public void set_report_type_description(String report_type_description) {
    this.report_type_description = report_type_description;
  }
  public police_dept_incident_reports with_report_type_description(String report_type_description) {
    this.report_type_description = report_type_description;
    return this;
  }
  private Boolean filled_online;
  public Boolean get_filled_online() {
    return filled_online;
  }
  public void set_filled_online(Boolean filled_online) {
    this.filled_online = filled_online;
  }
  public police_dept_incident_reports with_filled_online(Boolean filled_online) {
    this.filled_online = filled_online;
    return this;
  }
  private Integer incident_code;
  public Integer get_incident_code() {
    return incident_code;
  }
  public void set_incident_code(Integer incident_code) {
    this.incident_code = incident_code;
  }
  public police_dept_incident_reports with_incident_code(Integer incident_code) {
    this.incident_code = incident_code;
    return this;
  }
  private String incident_category;
  public String get_incident_category() {
    return incident_category;
  }
  public void set_incident_category(String incident_category) {
    this.incident_category = incident_category;
  }
  public police_dept_incident_reports with_incident_category(String incident_category) {
    this.incident_category = incident_category;
    return this;
  }
  private String incident_subcategory;
  public String get_incident_subcategory() {
    return incident_subcategory;
  }
  public void set_incident_subcategory(String incident_subcategory) {
    this.incident_subcategory = incident_subcategory;
  }
  public police_dept_incident_reports with_incident_subcategory(String incident_subcategory) {
    this.incident_subcategory = incident_subcategory;
    return this;
  }
  private String incident_descr;
  public String get_incident_descr() {
    return incident_descr;
  }
  public void set_incident_descr(String incident_descr) {
    this.incident_descr = incident_descr;
  }
  public police_dept_incident_reports with_incident_descr(String incident_descr) {
    this.incident_descr = incident_descr;
    return this;
  }
  private String resolution;
  public String get_resolution() {
    return resolution;
  }
  public void set_resolution(String resolution) {
    this.resolution = resolution;
  }
  public police_dept_incident_reports with_resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }
  private String intersection;
  public String get_intersection() {
    return intersection;
  }
  public void set_intersection(String intersection) {
    this.intersection = intersection;
  }
  public police_dept_incident_reports with_intersection(String intersection) {
    this.intersection = intersection;
    return this;
  }
  private Integer cnn;
  public Integer get_cnn() {
    return cnn;
  }
  public void set_cnn(Integer cnn) {
    this.cnn = cnn;
  }
  public police_dept_incident_reports with_cnn(Integer cnn) {
    this.cnn = cnn;
    return this;
  }
  private String police_district;
  public String get_police_district() {
    return police_district;
  }
  public void set_police_district(String police_district) {
    this.police_district = police_district;
  }
  public police_dept_incident_reports with_police_district(String police_district) {
    this.police_district = police_district;
    return this;
  }
  private String analysis_neigh;
  public String get_analysis_neigh() {
    return analysis_neigh;
  }
  public void set_analysis_neigh(String analysis_neigh) {
    this.analysis_neigh = analysis_neigh;
  }
  public police_dept_incident_reports with_analysis_neigh(String analysis_neigh) {
    this.analysis_neigh = analysis_neigh;
    return this;
  }
  private Integer supervisor_distr;
  public Integer get_supervisor_distr() {
    return supervisor_distr;
  }
  public void set_supervisor_distr(Integer supervisor_distr) {
    this.supervisor_distr = supervisor_distr;
  }
  public police_dept_incident_reports with_supervisor_distr(Integer supervisor_distr) {
    this.supervisor_distr = supervisor_distr;
    return this;
  }
  private Integer supervisor_distr_2012;
  public Integer get_supervisor_distr_2012() {
    return supervisor_distr_2012;
  }
  public void set_supervisor_distr_2012(Integer supervisor_distr_2012) {
    this.supervisor_distr_2012 = supervisor_distr_2012;
  }
  public police_dept_incident_reports with_supervisor_distr_2012(Integer supervisor_distr_2012) {
    this.supervisor_distr_2012 = supervisor_distr_2012;
    return this;
  }
  private Double latitude;
  public Double get_latitude() {
    return latitude;
  }
  public void set_latitude(Double latitude) {
    this.latitude = latitude;
  }
  public police_dept_incident_reports with_latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }
  private Double longitude;
  public Double get_longitude() {
    return longitude;
  }
  public void set_longitude(Double longitude) {
    this.longitude = longitude;
  }
  public police_dept_incident_reports with_longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }
  private String datapoint;
  public String get_datapoint() {
    return datapoint;
  }
  public void set_datapoint(String datapoint) {
    this.datapoint = datapoint;
  }
  public police_dept_incident_reports with_datapoint(String datapoint) {
    this.datapoint = datapoint;
    return this;
  }
  private Integer neighbourhoods;
  public Integer get_neighbourhoods() {
    return neighbourhoods;
  }
  public void set_neighbourhoods(Integer neighbourhoods) {
    this.neighbourhoods = neighbourhoods;
  }
  public police_dept_incident_reports with_neighbourhoods(Integer neighbourhoods) {
    this.neighbourhoods = neighbourhoods;
    return this;
  }
  private Integer esncag;
  public Integer get_esncag() {
    return esncag;
  }
  public void set_esncag(Integer esncag) {
    this.esncag = esncag;
  }
  public police_dept_incident_reports with_esncag(Integer esncag) {
    this.esncag = esncag;
    return this;
  }
  private Integer cm_polygon;
  public Integer get_cm_polygon() {
    return cm_polygon;
  }
  public void set_cm_polygon(Integer cm_polygon) {
    this.cm_polygon = cm_polygon;
  }
  public police_dept_incident_reports with_cm_polygon(Integer cm_polygon) {
    this.cm_polygon = cm_polygon;
    return this;
  }
  private Integer cchr;
  public Integer get_cchr() {
    return cchr;
  }
  public void set_cchr(Integer cchr) {
    this.cchr = cchr;
  }
  public police_dept_incident_reports with_cchr(Integer cchr) {
    this.cchr = cchr;
    return this;
  }
  private Integer hsoc;
  public Integer get_hsoc() {
    return hsoc;
  }
  public void set_hsoc(Integer hsoc) {
    this.hsoc = hsoc;
  }
  public police_dept_incident_reports with_hsoc(Integer hsoc) {
    this.hsoc = hsoc;
    return this;
  }
  private Integer iin;
  public Integer get_iin() {
    return iin;
  }
  public void set_iin(Integer iin) {
    this.iin = iin;
  }
  public police_dept_incident_reports with_iin(Integer iin) {
    this.iin = iin;
    return this;
  }
  private Integer csd;
  public Integer get_csd() {
    return csd;
  }
  public void set_csd(Integer csd) {
    this.csd = csd;
  }
  public police_dept_incident_reports with_csd(Integer csd) {
    this.csd = csd;
    return this;
  }
  private Integer cpd;
  public Integer get_cpd() {
    return cpd;
  }
  public void set_cpd(Integer cpd) {
    this.cpd = cpd;
  }
  public police_dept_incident_reports with_cpd(Integer cpd) {
    this.cpd = cpd;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof police_dept_incident_reports)) {
      return false;
    }
    police_dept_incident_reports that = (police_dept_incident_reports) o;
    boolean equal = true;
    equal = equal && (this.incident_datetime == null ? that.incident_datetime == null : this.incident_datetime.equals(that.incident_datetime));
    equal = equal && (this.incident_date == null ? that.incident_date == null : this.incident_date.equals(that.incident_date));
    equal = equal && (this.incident_time == null ? that.incident_time == null : this.incident_time.equals(that.incident_time));
    equal = equal && (this.incident_year == null ? that.incident_year == null : this.incident_year.equals(that.incident_year));
    equal = equal && (this.incident_dow == null ? that.incident_dow == null : this.incident_dow.equals(that.incident_dow));
    equal = equal && (this.report_datetime == null ? that.report_datetime == null : this.report_datetime.equals(that.report_datetime));
    equal = equal && (this.row_id == null ? that.row_id == null : this.row_id.equals(that.row_id));
    equal = equal && (this.incident_id == null ? that.incident_id == null : this.incident_id.equals(that.incident_id));
    equal = equal && (this.incident_number == null ? that.incident_number == null : this.incident_number.equals(that.incident_number));
    equal = equal && (this.cad_number == null ? that.cad_number == null : this.cad_number.equals(that.cad_number));
    equal = equal && (this.report_type_code == null ? that.report_type_code == null : this.report_type_code.equals(that.report_type_code));
    equal = equal && (this.report_type_description == null ? that.report_type_description == null : this.report_type_description.equals(that.report_type_description));
    equal = equal && (this.filled_online == null ? that.filled_online == null : this.filled_online.equals(that.filled_online));
    equal = equal && (this.incident_code == null ? that.incident_code == null : this.incident_code.equals(that.incident_code));
    equal = equal && (this.incident_category == null ? that.incident_category == null : this.incident_category.equals(that.incident_category));
    equal = equal && (this.incident_subcategory == null ? that.incident_subcategory == null : this.incident_subcategory.equals(that.incident_subcategory));
    equal = equal && (this.incident_descr == null ? that.incident_descr == null : this.incident_descr.equals(that.incident_descr));
    equal = equal && (this.resolution == null ? that.resolution == null : this.resolution.equals(that.resolution));
    equal = equal && (this.intersection == null ? that.intersection == null : this.intersection.equals(that.intersection));
    equal = equal && (this.cnn == null ? that.cnn == null : this.cnn.equals(that.cnn));
    equal = equal && (this.police_district == null ? that.police_district == null : this.police_district.equals(that.police_district));
    equal = equal && (this.analysis_neigh == null ? that.analysis_neigh == null : this.analysis_neigh.equals(that.analysis_neigh));
    equal = equal && (this.supervisor_distr == null ? that.supervisor_distr == null : this.supervisor_distr.equals(that.supervisor_distr));
    equal = equal && (this.supervisor_distr_2012 == null ? that.supervisor_distr_2012 == null : this.supervisor_distr_2012.equals(that.supervisor_distr_2012));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.datapoint == null ? that.datapoint == null : this.datapoint.equals(that.datapoint));
    equal = equal && (this.neighbourhoods == null ? that.neighbourhoods == null : this.neighbourhoods.equals(that.neighbourhoods));
    equal = equal && (this.esncag == null ? that.esncag == null : this.esncag.equals(that.esncag));
    equal = equal && (this.cm_polygon == null ? that.cm_polygon == null : this.cm_polygon.equals(that.cm_polygon));
    equal = equal && (this.cchr == null ? that.cchr == null : this.cchr.equals(that.cchr));
    equal = equal && (this.hsoc == null ? that.hsoc == null : this.hsoc.equals(that.hsoc));
    equal = equal && (this.iin == null ? that.iin == null : this.iin.equals(that.iin));
    equal = equal && (this.csd == null ? that.csd == null : this.csd.equals(that.csd));
    equal = equal && (this.cpd == null ? that.cpd == null : this.cpd.equals(that.cpd));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof police_dept_incident_reports)) {
      return false;
    }
    police_dept_incident_reports that = (police_dept_incident_reports) o;
    boolean equal = true;
    equal = equal && (this.incident_datetime == null ? that.incident_datetime == null : this.incident_datetime.equals(that.incident_datetime));
    equal = equal && (this.incident_date == null ? that.incident_date == null : this.incident_date.equals(that.incident_date));
    equal = equal && (this.incident_time == null ? that.incident_time == null : this.incident_time.equals(that.incident_time));
    equal = equal && (this.incident_year == null ? that.incident_year == null : this.incident_year.equals(that.incident_year));
    equal = equal && (this.incident_dow == null ? that.incident_dow == null : this.incident_dow.equals(that.incident_dow));
    equal = equal && (this.report_datetime == null ? that.report_datetime == null : this.report_datetime.equals(that.report_datetime));
    equal = equal && (this.row_id == null ? that.row_id == null : this.row_id.equals(that.row_id));
    equal = equal && (this.incident_id == null ? that.incident_id == null : this.incident_id.equals(that.incident_id));
    equal = equal && (this.incident_number == null ? that.incident_number == null : this.incident_number.equals(that.incident_number));
    equal = equal && (this.cad_number == null ? that.cad_number == null : this.cad_number.equals(that.cad_number));
    equal = equal && (this.report_type_code == null ? that.report_type_code == null : this.report_type_code.equals(that.report_type_code));
    equal = equal && (this.report_type_description == null ? that.report_type_description == null : this.report_type_description.equals(that.report_type_description));
    equal = equal && (this.filled_online == null ? that.filled_online == null : this.filled_online.equals(that.filled_online));
    equal = equal && (this.incident_code == null ? that.incident_code == null : this.incident_code.equals(that.incident_code));
    equal = equal && (this.incident_category == null ? that.incident_category == null : this.incident_category.equals(that.incident_category));
    equal = equal && (this.incident_subcategory == null ? that.incident_subcategory == null : this.incident_subcategory.equals(that.incident_subcategory));
    equal = equal && (this.incident_descr == null ? that.incident_descr == null : this.incident_descr.equals(that.incident_descr));
    equal = equal && (this.resolution == null ? that.resolution == null : this.resolution.equals(that.resolution));
    equal = equal && (this.intersection == null ? that.intersection == null : this.intersection.equals(that.intersection));
    equal = equal && (this.cnn == null ? that.cnn == null : this.cnn.equals(that.cnn));
    equal = equal && (this.police_district == null ? that.police_district == null : this.police_district.equals(that.police_district));
    equal = equal && (this.analysis_neigh == null ? that.analysis_neigh == null : this.analysis_neigh.equals(that.analysis_neigh));
    equal = equal && (this.supervisor_distr == null ? that.supervisor_distr == null : this.supervisor_distr.equals(that.supervisor_distr));
    equal = equal && (this.supervisor_distr_2012 == null ? that.supervisor_distr_2012 == null : this.supervisor_distr_2012.equals(that.supervisor_distr_2012));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.datapoint == null ? that.datapoint == null : this.datapoint.equals(that.datapoint));
    equal = equal && (this.neighbourhoods == null ? that.neighbourhoods == null : this.neighbourhoods.equals(that.neighbourhoods));
    equal = equal && (this.esncag == null ? that.esncag == null : this.esncag.equals(that.esncag));
    equal = equal && (this.cm_polygon == null ? that.cm_polygon == null : this.cm_polygon.equals(that.cm_polygon));
    equal = equal && (this.cchr == null ? that.cchr == null : this.cchr.equals(that.cchr));
    equal = equal && (this.hsoc == null ? that.hsoc == null : this.hsoc.equals(that.hsoc));
    equal = equal && (this.iin == null ? that.iin == null : this.iin.equals(that.iin));
    equal = equal && (this.csd == null ? that.csd == null : this.csd.equals(that.csd));
    equal = equal && (this.cpd == null ? that.cpd == null : this.cpd.equals(that.cpd));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.incident_datetime = JdbcWritableBridge.readDate(1, __dbResults);
    this.incident_date = JdbcWritableBridge.readDate(2, __dbResults);
    this.incident_time = JdbcWritableBridge.readString(3, __dbResults);
    this.incident_year = JdbcWritableBridge.readInteger(4, __dbResults);
    this.incident_dow = JdbcWritableBridge.readString(5, __dbResults);
    this.report_datetime = JdbcWritableBridge.readDate(6, __dbResults);
    this.row_id = JdbcWritableBridge.readLong(7, __dbResults);
    this.incident_id = JdbcWritableBridge.readInteger(8, __dbResults);
    this.incident_number = JdbcWritableBridge.readInteger(9, __dbResults);
    this.cad_number = JdbcWritableBridge.readInteger(10, __dbResults);
    this.report_type_code = JdbcWritableBridge.readString(11, __dbResults);
    this.report_type_description = JdbcWritableBridge.readString(12, __dbResults);
    this.filled_online = JdbcWritableBridge.readBoolean(13, __dbResults);
    this.incident_code = JdbcWritableBridge.readInteger(14, __dbResults);
    this.incident_category = JdbcWritableBridge.readString(15, __dbResults);
    this.incident_subcategory = JdbcWritableBridge.readString(16, __dbResults);
    this.incident_descr = JdbcWritableBridge.readString(17, __dbResults);
    this.resolution = JdbcWritableBridge.readString(18, __dbResults);
    this.intersection = JdbcWritableBridge.readString(19, __dbResults);
    this.cnn = JdbcWritableBridge.readInteger(20, __dbResults);
    this.police_district = JdbcWritableBridge.readString(21, __dbResults);
    this.analysis_neigh = JdbcWritableBridge.readString(22, __dbResults);
    this.supervisor_distr = JdbcWritableBridge.readInteger(23, __dbResults);
    this.supervisor_distr_2012 = JdbcWritableBridge.readInteger(24, __dbResults);
    this.latitude = JdbcWritableBridge.readDouble(25, __dbResults);
    this.longitude = JdbcWritableBridge.readDouble(26, __dbResults);
    this.datapoint = JdbcWritableBridge.readString(27, __dbResults);
    this.neighbourhoods = JdbcWritableBridge.readInteger(28, __dbResults);
    this.esncag = JdbcWritableBridge.readInteger(29, __dbResults);
    this.cm_polygon = JdbcWritableBridge.readInteger(30, __dbResults);
    this.cchr = JdbcWritableBridge.readInteger(31, __dbResults);
    this.hsoc = JdbcWritableBridge.readInteger(32, __dbResults);
    this.iin = JdbcWritableBridge.readInteger(33, __dbResults);
    this.csd = JdbcWritableBridge.readInteger(34, __dbResults);
    this.cpd = JdbcWritableBridge.readInteger(35, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.incident_datetime = JdbcWritableBridge.readDate(1, __dbResults);
    this.incident_date = JdbcWritableBridge.readDate(2, __dbResults);
    this.incident_time = JdbcWritableBridge.readString(3, __dbResults);
    this.incident_year = JdbcWritableBridge.readInteger(4, __dbResults);
    this.incident_dow = JdbcWritableBridge.readString(5, __dbResults);
    this.report_datetime = JdbcWritableBridge.readDate(6, __dbResults);
    this.row_id = JdbcWritableBridge.readLong(7, __dbResults);
    this.incident_id = JdbcWritableBridge.readInteger(8, __dbResults);
    this.incident_number = JdbcWritableBridge.readInteger(9, __dbResults);
    this.cad_number = JdbcWritableBridge.readInteger(10, __dbResults);
    this.report_type_code = JdbcWritableBridge.readString(11, __dbResults);
    this.report_type_description = JdbcWritableBridge.readString(12, __dbResults);
    this.filled_online = JdbcWritableBridge.readBoolean(13, __dbResults);
    this.incident_code = JdbcWritableBridge.readInteger(14, __dbResults);
    this.incident_category = JdbcWritableBridge.readString(15, __dbResults);
    this.incident_subcategory = JdbcWritableBridge.readString(16, __dbResults);
    this.incident_descr = JdbcWritableBridge.readString(17, __dbResults);
    this.resolution = JdbcWritableBridge.readString(18, __dbResults);
    this.intersection = JdbcWritableBridge.readString(19, __dbResults);
    this.cnn = JdbcWritableBridge.readInteger(20, __dbResults);
    this.police_district = JdbcWritableBridge.readString(21, __dbResults);
    this.analysis_neigh = JdbcWritableBridge.readString(22, __dbResults);
    this.supervisor_distr = JdbcWritableBridge.readInteger(23, __dbResults);
    this.supervisor_distr_2012 = JdbcWritableBridge.readInteger(24, __dbResults);
    this.latitude = JdbcWritableBridge.readDouble(25, __dbResults);
    this.longitude = JdbcWritableBridge.readDouble(26, __dbResults);
    this.datapoint = JdbcWritableBridge.readString(27, __dbResults);
    this.neighbourhoods = JdbcWritableBridge.readInteger(28, __dbResults);
    this.esncag = JdbcWritableBridge.readInteger(29, __dbResults);
    this.cm_polygon = JdbcWritableBridge.readInteger(30, __dbResults);
    this.cchr = JdbcWritableBridge.readInteger(31, __dbResults);
    this.hsoc = JdbcWritableBridge.readInteger(32, __dbResults);
    this.iin = JdbcWritableBridge.readInteger(33, __dbResults);
    this.csd = JdbcWritableBridge.readInteger(34, __dbResults);
    this.cpd = JdbcWritableBridge.readInteger(35, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(incident_datetime, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(incident_date, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(incident_time, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(incident_year, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(incident_dow, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(report_datetime, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeLong(row_id, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(incident_id, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(incident_number, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cad_number, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(report_type_code, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(report_type_description, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(filled_online, 13 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeInteger(incident_code, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(incident_category, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(incident_subcategory, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(incident_descr, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(resolution, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(intersection, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(cnn, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(police_district, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(analysis_neigh, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(supervisor_distr, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(supervisor_distr_2012, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(latitude, 25 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(longitude, 26 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(datapoint, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(neighbourhoods, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(esncag, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cm_polygon, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cchr, 31 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(hsoc, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(iin, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(csd, 34 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cpd, 35 + __off, 4, __dbStmt);
    return 35;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(incident_datetime, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(incident_date, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(incident_time, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(incident_year, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(incident_dow, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(report_datetime, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeLong(row_id, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(incident_id, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(incident_number, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cad_number, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(report_type_code, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(report_type_description, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(filled_online, 13 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeInteger(incident_code, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(incident_category, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(incident_subcategory, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(incident_descr, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(resolution, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(intersection, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(cnn, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(police_district, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(analysis_neigh, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(supervisor_distr, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(supervisor_distr_2012, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(latitude, 25 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(longitude, 26 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(datapoint, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(neighbourhoods, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(esncag, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cm_polygon, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cchr, 31 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(hsoc, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(iin, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(csd, 34 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cpd, 35 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.incident_datetime = null;
    } else {
    this.incident_datetime = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.incident_date = null;
    } else {
    this.incident_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.incident_time = null;
    } else {
    this.incident_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.incident_year = null;
    } else {
    this.incident_year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.incident_dow = null;
    } else {
    this.incident_dow = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.report_datetime = null;
    } else {
    this.report_datetime = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.row_id = null;
    } else {
    this.row_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.incident_id = null;
    } else {
    this.incident_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.incident_number = null;
    } else {
    this.incident_number = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cad_number = null;
    } else {
    this.cad_number = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.report_type_code = null;
    } else {
    this.report_type_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.report_type_description = null;
    } else {
    this.report_type_description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.filled_online = null;
    } else {
    this.filled_online = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.incident_code = null;
    } else {
    this.incident_code = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.incident_category = null;
    } else {
    this.incident_category = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.incident_subcategory = null;
    } else {
    this.incident_subcategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.incident_descr = null;
    } else {
    this.incident_descr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.resolution = null;
    } else {
    this.resolution = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.intersection = null;
    } else {
    this.intersection = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cnn = null;
    } else {
    this.cnn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.police_district = null;
    } else {
    this.police_district = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.analysis_neigh = null;
    } else {
    this.analysis_neigh = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.supervisor_distr = null;
    } else {
    this.supervisor_distr = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.supervisor_distr_2012 = null;
    } else {
    this.supervisor_distr_2012 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.latitude = null;
    } else {
    this.latitude = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.longitude = null;
    } else {
    this.longitude = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.datapoint = null;
    } else {
    this.datapoint = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.neighbourhoods = null;
    } else {
    this.neighbourhoods = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.esncag = null;
    } else {
    this.esncag = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cm_polygon = null;
    } else {
    this.cm_polygon = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cchr = null;
    } else {
    this.cchr = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.hsoc = null;
    } else {
    this.hsoc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.iin = null;
    } else {
    this.iin = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.csd = null;
    } else {
    this.csd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cpd = null;
    } else {
    this.cpd = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.incident_datetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.incident_datetime.getTime());
    }
    if (null == this.incident_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.incident_date.getTime());
    }
    if (null == this.incident_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_time);
    }
    if (null == this.incident_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.incident_year);
    }
    if (null == this.incident_dow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_dow);
    }
    if (null == this.report_datetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.report_datetime.getTime());
    }
    if (null == this.row_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.row_id);
    }
    if (null == this.incident_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.incident_id);
    }
    if (null == this.incident_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.incident_number);
    }
    if (null == this.cad_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cad_number);
    }
    if (null == this.report_type_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, report_type_code);
    }
    if (null == this.report_type_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, report_type_description);
    }
    if (null == this.filled_online) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.filled_online);
    }
    if (null == this.incident_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.incident_code);
    }
    if (null == this.incident_category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_category);
    }
    if (null == this.incident_subcategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_subcategory);
    }
    if (null == this.incident_descr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_descr);
    }
    if (null == this.resolution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, resolution);
    }
    if (null == this.intersection) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, intersection);
    }
    if (null == this.cnn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cnn);
    }
    if (null == this.police_district) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, police_district);
    }
    if (null == this.analysis_neigh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, analysis_neigh);
    }
    if (null == this.supervisor_distr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.supervisor_distr);
    }
    if (null == this.supervisor_distr_2012) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.supervisor_distr_2012);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.latitude);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.longitude);
    }
    if (null == this.datapoint) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, datapoint);
    }
    if (null == this.neighbourhoods) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.neighbourhoods);
    }
    if (null == this.esncag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.esncag);
    }
    if (null == this.cm_polygon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cm_polygon);
    }
    if (null == this.cchr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cchr);
    }
    if (null == this.hsoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hsoc);
    }
    if (null == this.iin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.iin);
    }
    if (null == this.csd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.csd);
    }
    if (null == this.cpd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cpd);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.incident_datetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.incident_datetime.getTime());
    }
    if (null == this.incident_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.incident_date.getTime());
    }
    if (null == this.incident_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_time);
    }
    if (null == this.incident_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.incident_year);
    }
    if (null == this.incident_dow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_dow);
    }
    if (null == this.report_datetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.report_datetime.getTime());
    }
    if (null == this.row_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.row_id);
    }
    if (null == this.incident_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.incident_id);
    }
    if (null == this.incident_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.incident_number);
    }
    if (null == this.cad_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cad_number);
    }
    if (null == this.report_type_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, report_type_code);
    }
    if (null == this.report_type_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, report_type_description);
    }
    if (null == this.filled_online) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.filled_online);
    }
    if (null == this.incident_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.incident_code);
    }
    if (null == this.incident_category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_category);
    }
    if (null == this.incident_subcategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_subcategory);
    }
    if (null == this.incident_descr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_descr);
    }
    if (null == this.resolution) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, resolution);
    }
    if (null == this.intersection) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, intersection);
    }
    if (null == this.cnn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cnn);
    }
    if (null == this.police_district) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, police_district);
    }
    if (null == this.analysis_neigh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, analysis_neigh);
    }
    if (null == this.supervisor_distr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.supervisor_distr);
    }
    if (null == this.supervisor_distr_2012) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.supervisor_distr_2012);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.latitude);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.longitude);
    }
    if (null == this.datapoint) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, datapoint);
    }
    if (null == this.neighbourhoods) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.neighbourhoods);
    }
    if (null == this.esncag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.esncag);
    }
    if (null == this.cm_polygon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cm_polygon);
    }
    if (null == this.cchr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cchr);
    }
    if (null == this.hsoc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hsoc);
    }
    if (null == this.iin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.iin);
    }
    if (null == this.csd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.csd);
    }
    if (null == this.cpd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cpd);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(incident_datetime==null?"null":"" + incident_datetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_date==null?"null":"" + incident_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_time==null?"null":incident_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_year==null?"null":"" + incident_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_dow==null?"null":incident_dow, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(report_datetime==null?"null":"" + report_datetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(row_id==null?"null":"" + row_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_id==null?"null":"" + incident_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_number==null?"null":"" + incident_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cad_number==null?"null":"" + cad_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(report_type_code==null?"null":report_type_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(report_type_description==null?"null":report_type_description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(filled_online==null?"null":"" + filled_online, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_code==null?"null":"" + incident_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_category==null?"null":incident_category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_subcategory==null?"null":incident_subcategory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_descr==null?"null":incident_descr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(resolution==null?"null":resolution, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(intersection==null?"null":intersection, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cnn==null?"null":"" + cnn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(police_district==null?"null":police_district, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(analysis_neigh==null?"null":analysis_neigh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supervisor_distr==null?"null":"" + supervisor_distr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supervisor_distr_2012==null?"null":"" + supervisor_distr_2012, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":"" + latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":"" + longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datapoint==null?"null":datapoint, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighbourhoods==null?"null":"" + neighbourhoods, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(esncag==null?"null":"" + esncag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cm_polygon==null?"null":"" + cm_polygon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cchr==null?"null":"" + cchr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hsoc==null?"null":"" + hsoc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iin==null?"null":"" + iin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(csd==null?"null":"" + csd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cpd==null?"null":"" + cpd, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(incident_datetime==null?"null":"" + incident_datetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_date==null?"null":"" + incident_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_time==null?"null":incident_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_year==null?"null":"" + incident_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_dow==null?"null":incident_dow, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(report_datetime==null?"null":"" + report_datetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(row_id==null?"null":"" + row_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_id==null?"null":"" + incident_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_number==null?"null":"" + incident_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cad_number==null?"null":"" + cad_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(report_type_code==null?"null":report_type_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(report_type_description==null?"null":report_type_description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(filled_online==null?"null":"" + filled_online, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_code==null?"null":"" + incident_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_category==null?"null":incident_category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_subcategory==null?"null":incident_subcategory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_descr==null?"null":incident_descr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(resolution==null?"null":resolution, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(intersection==null?"null":intersection, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cnn==null?"null":"" + cnn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(police_district==null?"null":police_district, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(analysis_neigh==null?"null":analysis_neigh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supervisor_distr==null?"null":"" + supervisor_distr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supervisor_distr_2012==null?"null":"" + supervisor_distr_2012, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":"" + latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":"" + longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datapoint==null?"null":datapoint, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighbourhoods==null?"null":"" + neighbourhoods, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(esncag==null?"null":"" + esncag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cm_polygon==null?"null":"" + cm_polygon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cchr==null?"null":"" + cchr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hsoc==null?"null":"" + hsoc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iin==null?"null":"" + iin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(csd==null?"null":"" + csd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cpd==null?"null":"" + cpd, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_datetime = null; } else {
      this.incident_datetime = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_date = null; } else {
      this.incident_date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_time = null; } else {
      this.incident_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_year = null; } else {
      this.incident_year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_dow = null; } else {
      this.incident_dow = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.report_datetime = null; } else {
      this.report_datetime = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.row_id = null; } else {
      this.row_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_id = null; } else {
      this.incident_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_number = null; } else {
      this.incident_number = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cad_number = null; } else {
      this.cad_number = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.report_type_code = null; } else {
      this.report_type_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.report_type_description = null; } else {
      this.report_type_description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.filled_online = null; } else {
      this.filled_online = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_code = null; } else {
      this.incident_code = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_category = null; } else {
      this.incident_category = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_subcategory = null; } else {
      this.incident_subcategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_descr = null; } else {
      this.incident_descr = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.resolution = null; } else {
      this.resolution = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.intersection = null; } else {
      this.intersection = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cnn = null; } else {
      this.cnn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.police_district = null; } else {
      this.police_district = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.analysis_neigh = null; } else {
      this.analysis_neigh = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.supervisor_distr = null; } else {
      this.supervisor_distr = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.supervisor_distr_2012 = null; } else {
      this.supervisor_distr_2012 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.latitude = null; } else {
      this.latitude = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.longitude = null; } else {
      this.longitude = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.datapoint = null; } else {
      this.datapoint = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.neighbourhoods = null; } else {
      this.neighbourhoods = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.esncag = null; } else {
      this.esncag = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cm_polygon = null; } else {
      this.cm_polygon = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cchr = null; } else {
      this.cchr = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hsoc = null; } else {
      this.hsoc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.iin = null; } else {
      this.iin = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.csd = null; } else {
      this.csd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cpd = null; } else {
      this.cpd = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_datetime = null; } else {
      this.incident_datetime = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_date = null; } else {
      this.incident_date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_time = null; } else {
      this.incident_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_year = null; } else {
      this.incident_year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_dow = null; } else {
      this.incident_dow = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.report_datetime = null; } else {
      this.report_datetime = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.row_id = null; } else {
      this.row_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_id = null; } else {
      this.incident_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_number = null; } else {
      this.incident_number = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cad_number = null; } else {
      this.cad_number = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.report_type_code = null; } else {
      this.report_type_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.report_type_description = null; } else {
      this.report_type_description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.filled_online = null; } else {
      this.filled_online = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_code = null; } else {
      this.incident_code = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_category = null; } else {
      this.incident_category = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_subcategory = null; } else {
      this.incident_subcategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_descr = null; } else {
      this.incident_descr = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.resolution = null; } else {
      this.resolution = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.intersection = null; } else {
      this.intersection = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cnn = null; } else {
      this.cnn = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.police_district = null; } else {
      this.police_district = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.analysis_neigh = null; } else {
      this.analysis_neigh = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.supervisor_distr = null; } else {
      this.supervisor_distr = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.supervisor_distr_2012 = null; } else {
      this.supervisor_distr_2012 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.latitude = null; } else {
      this.latitude = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.longitude = null; } else {
      this.longitude = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.datapoint = null; } else {
      this.datapoint = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.neighbourhoods = null; } else {
      this.neighbourhoods = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.esncag = null; } else {
      this.esncag = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cm_polygon = null; } else {
      this.cm_polygon = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cchr = null; } else {
      this.cchr = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hsoc = null; } else {
      this.hsoc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.iin = null; } else {
      this.iin = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.csd = null; } else {
      this.csd = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cpd = null; } else {
      this.cpd = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    police_dept_incident_reports o = (police_dept_incident_reports) super.clone();
    o.incident_datetime = (o.incident_datetime != null) ? (java.sql.Date) o.incident_datetime.clone() : null;
    o.incident_date = (o.incident_date != null) ? (java.sql.Date) o.incident_date.clone() : null;
    o.report_datetime = (o.report_datetime != null) ? (java.sql.Date) o.report_datetime.clone() : null;
    return o;
  }

  public void clone0(police_dept_incident_reports o) throws CloneNotSupportedException {
    o.incident_datetime = (o.incident_datetime != null) ? (java.sql.Date) o.incident_datetime.clone() : null;
    o.incident_date = (o.incident_date != null) ? (java.sql.Date) o.incident_date.clone() : null;
    o.report_datetime = (o.report_datetime != null) ? (java.sql.Date) o.report_datetime.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("incident_datetime", this.incident_datetime);
    __sqoop$field_map.put("incident_date", this.incident_date);
    __sqoop$field_map.put("incident_time", this.incident_time);
    __sqoop$field_map.put("incident_year", this.incident_year);
    __sqoop$field_map.put("incident_dow", this.incident_dow);
    __sqoop$field_map.put("report_datetime", this.report_datetime);
    __sqoop$field_map.put("row_id", this.row_id);
    __sqoop$field_map.put("incident_id", this.incident_id);
    __sqoop$field_map.put("incident_number", this.incident_number);
    __sqoop$field_map.put("cad_number", this.cad_number);
    __sqoop$field_map.put("report_type_code", this.report_type_code);
    __sqoop$field_map.put("report_type_description", this.report_type_description);
    __sqoop$field_map.put("filled_online", this.filled_online);
    __sqoop$field_map.put("incident_code", this.incident_code);
    __sqoop$field_map.put("incident_category", this.incident_category);
    __sqoop$field_map.put("incident_subcategory", this.incident_subcategory);
    __sqoop$field_map.put("incident_descr", this.incident_descr);
    __sqoop$field_map.put("resolution", this.resolution);
    __sqoop$field_map.put("intersection", this.intersection);
    __sqoop$field_map.put("cnn", this.cnn);
    __sqoop$field_map.put("police_district", this.police_district);
    __sqoop$field_map.put("analysis_neigh", this.analysis_neigh);
    __sqoop$field_map.put("supervisor_distr", this.supervisor_distr);
    __sqoop$field_map.put("supervisor_distr_2012", this.supervisor_distr_2012);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("datapoint", this.datapoint);
    __sqoop$field_map.put("neighbourhoods", this.neighbourhoods);
    __sqoop$field_map.put("esncag", this.esncag);
    __sqoop$field_map.put("cm_polygon", this.cm_polygon);
    __sqoop$field_map.put("cchr", this.cchr);
    __sqoop$field_map.put("hsoc", this.hsoc);
    __sqoop$field_map.put("iin", this.iin);
    __sqoop$field_map.put("csd", this.csd);
    __sqoop$field_map.put("cpd", this.cpd);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("incident_datetime", this.incident_datetime);
    __sqoop$field_map.put("incident_date", this.incident_date);
    __sqoop$field_map.put("incident_time", this.incident_time);
    __sqoop$field_map.put("incident_year", this.incident_year);
    __sqoop$field_map.put("incident_dow", this.incident_dow);
    __sqoop$field_map.put("report_datetime", this.report_datetime);
    __sqoop$field_map.put("row_id", this.row_id);
    __sqoop$field_map.put("incident_id", this.incident_id);
    __sqoop$field_map.put("incident_number", this.incident_number);
    __sqoop$field_map.put("cad_number", this.cad_number);
    __sqoop$field_map.put("report_type_code", this.report_type_code);
    __sqoop$field_map.put("report_type_description", this.report_type_description);
    __sqoop$field_map.put("filled_online", this.filled_online);
    __sqoop$field_map.put("incident_code", this.incident_code);
    __sqoop$field_map.put("incident_category", this.incident_category);
    __sqoop$field_map.put("incident_subcategory", this.incident_subcategory);
    __sqoop$field_map.put("incident_descr", this.incident_descr);
    __sqoop$field_map.put("resolution", this.resolution);
    __sqoop$field_map.put("intersection", this.intersection);
    __sqoop$field_map.put("cnn", this.cnn);
    __sqoop$field_map.put("police_district", this.police_district);
    __sqoop$field_map.put("analysis_neigh", this.analysis_neigh);
    __sqoop$field_map.put("supervisor_distr", this.supervisor_distr);
    __sqoop$field_map.put("supervisor_distr_2012", this.supervisor_distr_2012);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("datapoint", this.datapoint);
    __sqoop$field_map.put("neighbourhoods", this.neighbourhoods);
    __sqoop$field_map.put("esncag", this.esncag);
    __sqoop$field_map.put("cm_polygon", this.cm_polygon);
    __sqoop$field_map.put("cchr", this.cchr);
    __sqoop$field_map.put("hsoc", this.hsoc);
    __sqoop$field_map.put("iin", this.iin);
    __sqoop$field_map.put("csd", this.csd);
    __sqoop$field_map.put("cpd", this.cpd);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
