<?php
$query = $_GET['q'];
shell_exec("javac json/Main.java");
$output = shell_exec("java json/Main " . $query);
echo $output;
