// ORM class for table 'tmp_wt_user_activeoutline'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 06 18:44:38 CST 2017
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
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

public class tmp_wt_user_activeoutline extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        dt = (String)value;
      }
    });
    setters.put("spreadid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        spreadid = (String)value;
      }
    });
    setters.put("day_new_user", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        day_new_user = (Integer)value;
      }
    });
    setters.put("day_active_user", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        day_active_user = (Integer)value;
      }
    });
    setters.put("cumulative_user", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cumulative_user = (Integer)value;
      }
    });
    setters.put("new_user_rate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        new_user_rate = (String)value;
      }
    });
    setters.put("average_duration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        average_duration = (String)value;
      }
    });
  }
  public tmp_wt_user_activeoutline() {
    init0();
  }
  private String dt;
  public String get_dt() {
    return dt;
  }
  public void set_dt(String dt) {
    this.dt = dt;
  }
  public tmp_wt_user_activeoutline with_dt(String dt) {
    this.dt = dt;
    return this;
  }
  private String spreadid;
  public String get_spreadid() {
    return spreadid;
  }
  public void set_spreadid(String spreadid) {
    this.spreadid = spreadid;
  }
  public tmp_wt_user_activeoutline with_spreadid(String spreadid) {
    this.spreadid = spreadid;
    return this;
  }
  private Integer day_new_user;
  public Integer get_day_new_user() {
    return day_new_user;
  }
  public void set_day_new_user(Integer day_new_user) {
    this.day_new_user = day_new_user;
  }
  public tmp_wt_user_activeoutline with_day_new_user(Integer day_new_user) {
    this.day_new_user = day_new_user;
    return this;
  }
  private Integer day_active_user;
  public Integer get_day_active_user() {
    return day_active_user;
  }
  public void set_day_active_user(Integer day_active_user) {
    this.day_active_user = day_active_user;
  }
  public tmp_wt_user_activeoutline with_day_active_user(Integer day_active_user) {
    this.day_active_user = day_active_user;
    return this;
  }
  private Integer cumulative_user;
  public Integer get_cumulative_user() {
    return cumulative_user;
  }
  public void set_cumulative_user(Integer cumulative_user) {
    this.cumulative_user = cumulative_user;
  }
  public tmp_wt_user_activeoutline with_cumulative_user(Integer cumulative_user) {
    this.cumulative_user = cumulative_user;
    return this;
  }
  private String new_user_rate;
  public String get_new_user_rate() {
    return new_user_rate;
  }
  public void set_new_user_rate(String new_user_rate) {
    this.new_user_rate = new_user_rate;
  }
  public tmp_wt_user_activeoutline with_new_user_rate(String new_user_rate) {
    this.new_user_rate = new_user_rate;
    return this;
  }
  private String average_duration;
  public String get_average_duration() {
    return average_duration;
  }
  public void set_average_duration(String average_duration) {
    this.average_duration = average_duration;
  }
  public tmp_wt_user_activeoutline with_average_duration(String average_duration) {
    this.average_duration = average_duration;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tmp_wt_user_activeoutline)) {
      return false;
    }
    tmp_wt_user_activeoutline that = (tmp_wt_user_activeoutline) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.spreadid == null ? that.spreadid == null : this.spreadid.equals(that.spreadid));
    equal = equal && (this.day_new_user == null ? that.day_new_user == null : this.day_new_user.equals(that.day_new_user));
    equal = equal && (this.day_active_user == null ? that.day_active_user == null : this.day_active_user.equals(that.day_active_user));
    equal = equal && (this.cumulative_user == null ? that.cumulative_user == null : this.cumulative_user.equals(that.cumulative_user));
    equal = equal && (this.new_user_rate == null ? that.new_user_rate == null : this.new_user_rate.equals(that.new_user_rate));
    equal = equal && (this.average_duration == null ? that.average_duration == null : this.average_duration.equals(that.average_duration));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tmp_wt_user_activeoutline)) {
      return false;
    }
    tmp_wt_user_activeoutline that = (tmp_wt_user_activeoutline) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.spreadid == null ? that.spreadid == null : this.spreadid.equals(that.spreadid));
    equal = equal && (this.day_new_user == null ? that.day_new_user == null : this.day_new_user.equals(that.day_new_user));
    equal = equal && (this.day_active_user == null ? that.day_active_user == null : this.day_active_user.equals(that.day_active_user));
    equal = equal && (this.cumulative_user == null ? that.cumulative_user == null : this.cumulative_user.equals(that.cumulative_user));
    equal = equal && (this.new_user_rate == null ? that.new_user_rate == null : this.new_user_rate.equals(that.new_user_rate));
    equal = equal && (this.average_duration == null ? that.average_duration == null : this.average_duration.equals(that.average_duration));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dt = JdbcWritableBridge.readString(1, __dbResults);
    this.spreadid = JdbcWritableBridge.readString(2, __dbResults);
    this.day_new_user = JdbcWritableBridge.readInteger(3, __dbResults);
    this.day_active_user = JdbcWritableBridge.readInteger(4, __dbResults);
    this.cumulative_user = JdbcWritableBridge.readInteger(5, __dbResults);
    this.new_user_rate = JdbcWritableBridge.readString(6, __dbResults);
    this.average_duration = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dt = JdbcWritableBridge.readString(1, __dbResults);
    this.spreadid = JdbcWritableBridge.readString(2, __dbResults);
    this.day_new_user = JdbcWritableBridge.readInteger(3, __dbResults);
    this.day_active_user = JdbcWritableBridge.readInteger(4, __dbResults);
    this.cumulative_user = JdbcWritableBridge.readInteger(5, __dbResults);
    this.new_user_rate = JdbcWritableBridge.readString(6, __dbResults);
    this.average_duration = JdbcWritableBridge.readString(7, __dbResults);
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
    JdbcWritableBridge.writeString(dt, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(spreadid, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(day_new_user, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(day_active_user, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cumulative_user, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(new_user_rate, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(average_duration, 7 + __off, 12, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(dt, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(spreadid, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(day_new_user, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(day_active_user, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cumulative_user, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(new_user_rate, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(average_duration, 7 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.dt = null;
    } else {
    this.dt = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.spreadid = null;
    } else {
    this.spreadid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.day_new_user = null;
    } else {
    this.day_new_user = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.day_active_user = null;
    } else {
    this.day_active_user = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cumulative_user = null;
    } else {
    this.cumulative_user = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.new_user_rate = null;
    } else {
    this.new_user_rate = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.average_duration = null;
    } else {
    this.average_duration = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dt);
    }
    if (null == this.spreadid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, spreadid);
    }
    if (null == this.day_new_user) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.day_new_user);
    }
    if (null == this.day_active_user) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.day_active_user);
    }
    if (null == this.cumulative_user) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cumulative_user);
    }
    if (null == this.new_user_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, new_user_rate);
    }
    if (null == this.average_duration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, average_duration);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dt);
    }
    if (null == this.spreadid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, spreadid);
    }
    if (null == this.day_new_user) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.day_new_user);
    }
    if (null == this.day_active_user) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.day_active_user);
    }
    if (null == this.cumulative_user) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cumulative_user);
    }
    if (null == this.new_user_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, new_user_rate);
    }
    if (null == this.average_duration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, average_duration);
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
    __sb.append(FieldFormatter.escapeAndEnclose(dt==null?"null":dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(spreadid==null?"null":spreadid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(day_new_user==null?"null":"" + day_new_user, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(day_active_user==null?"null":"" + day_active_user, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cumulative_user==null?"null":"" + cumulative_user, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(new_user_rate==null?"null":new_user_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(average_duration==null?"null":average_duration, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(dt==null?"null":dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(spreadid==null?"null":spreadid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(day_new_user==null?"null":"" + day_new_user, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(day_active_user==null?"null":"" + day_active_user, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cumulative_user==null?"null":"" + cumulative_user, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(new_user_rate==null?"null":new_user_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(average_duration==null?"null":average_duration, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
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
    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.dt = null; } else {
      this.dt = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.spreadid = null; } else {
      this.spreadid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.day_new_user = null; } else {
      this.day_new_user = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.day_active_user = null; } else {
      this.day_active_user = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.cumulative_user = null; } else {
      this.cumulative_user = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.new_user_rate = null; } else {
      this.new_user_rate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.average_duration = null; } else {
      this.average_duration = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.dt = null; } else {
      this.dt = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.spreadid = null; } else {
      this.spreadid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.day_new_user = null; } else {
      this.day_new_user = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.day_active_user = null; } else {
      this.day_active_user = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.cumulative_user = null; } else {
      this.cumulative_user = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.new_user_rate = null; } else {
      this.new_user_rate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.average_duration = null; } else {
      this.average_duration = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tmp_wt_user_activeoutline o = (tmp_wt_user_activeoutline) super.clone();
    return o;
  }

  public void clone0(tmp_wt_user_activeoutline o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("spreadid", this.spreadid);
    __sqoop$field_map.put("day_new_user", this.day_new_user);
    __sqoop$field_map.put("day_active_user", this.day_active_user);
    __sqoop$field_map.put("cumulative_user", this.cumulative_user);
    __sqoop$field_map.put("new_user_rate", this.new_user_rate);
    __sqoop$field_map.put("average_duration", this.average_duration);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("spreadid", this.spreadid);
    __sqoop$field_map.put("day_new_user", this.day_new_user);
    __sqoop$field_map.put("day_active_user", this.day_active_user);
    __sqoop$field_map.put("cumulative_user", this.cumulative_user);
    __sqoop$field_map.put("new_user_rate", this.new_user_rate);
    __sqoop$field_map.put("average_duration", this.average_duration);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
