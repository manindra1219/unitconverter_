<html>
<head>
<title>MainActivity.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cc7832;}
.s1 { color: #a9b7c6;}
.s2 { color: #6897bb;}
.s3 { color: #6a8759;}
</style>
</head>
<body bgcolor="#2b2b2b">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
MainActivity.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">com.example.unitconveter</span><span class="s0">;</span>

<span class="s0">import </span><span class="s1">android.os.Bundle</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.view.View</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.widget.Button</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.widget.EditText</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.widget.RadioButton</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.widget.RadioGroup</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.widget.TextView</span><span class="s0">;</span>

<span class="s0">import </span><span class="s1">androidx.appcompat.app.AppCompatActivity</span><span class="s0">;</span>

<span class="s0">public class </span><span class="s1">MainActivity </span><span class="s0">extends </span><span class="s1">AppCompatActivity {</span>

    <span class="s0">private </span><span class="s1">EditText valueInput</span><span class="s0">;</span>
    <span class="s0">private </span><span class="s1">RadioGroup unitRadioGroup</span><span class="s0">;</span>
    <span class="s0">private </span><span class="s1">Button convertButton</span><span class="s0">;</span>
    <span class="s0">private </span><span class="s1">TextView resultText</span><span class="s0">;</span>

    <span class="s1">@Override</span>
    <span class="s0">protected void </span><span class="s1">onCreate(Bundle savedInstanceState) {</span>
        <span class="s0">super</span><span class="s1">.onCreate(savedInstanceState)</span><span class="s0">;</span>
        <span class="s1">setContentView(R.layout.activity_main)</span><span class="s0">;</span>

        <span class="s1">valueInput = findViewById(R.id.value_input)</span><span class="s0">;</span>
        <span class="s1">unitRadioGroup = findViewById(R.id.unit_radio_group)</span><span class="s0">;</span>
        <span class="s1">convertButton = findViewById(R.id.convert_button)</span><span class="s0">;</span>
        <span class="s1">resultText = findViewById(R.id.result_text)</span><span class="s0">;</span>

        <span class="s1">convertButton.setOnClickListener(</span><span class="s0">new </span><span class="s1">View.OnClickListener() {</span>
            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onClick(View view) {</span>
                <span class="s0">double </span><span class="s1">inputValue = Double.parseDouble(valueInput.getText().toString())</span><span class="s0">;</span>

                <span class="s0">if </span><span class="s1">(unitRadioGroup.getCheckedRadioButtonId() == R.id.cm_to_m) {</span>
                    <span class="s0">double </span><span class="s1">result = inputValue / </span><span class="s2">100</span><span class="s0">;</span>
                    <span class="s1">resultText.setText(String.format(</span><span class="s3">&quot;%.2f meters&quot;</span><span class="s0">, </span><span class="s1">result))</span><span class="s0">;</span>
                <span class="s1">} </span><span class="s0">else if </span><span class="s1">(unitRadioGroup.getCheckedRadioButtonId() == R.id.g_to_kg) {</span>
                    <span class="s0">double </span><span class="s1">result = inputValue / </span><span class="s2">1000</span><span class="s0">;</span>
                    <span class="s1">resultText.setText(String.format(</span><span class="s3">&quot;%.2f kilograms&quot;</span><span class="s0">, </span><span class="s1">result))</span><span class="s0">;</span>
                <span class="s1">}</span>
            <span class="s1">}</span>
        <span class="s1">})</span><span class="s0">;</span>
    <span class="s1">}</span>
<span class="s1">}</span>
</pre>
</body>
</html>