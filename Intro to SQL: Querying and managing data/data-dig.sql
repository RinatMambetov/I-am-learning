/* Put your data in here and query it! */
/* 
Solar system objects
Adapted from: http://en.wikipedia.org/wiki/List_of_Solar_System_objects_by_size
Collected by: https://www.khanacademy.org/profile/patrick809/programs
*/
CREATE TABLE solar_system_objects(
  body TEXT
, mean_radius NUMERIC         /* km */
, mean_radius_rel NUMERIC     /* relative to earth */
, volume NUMERIC              /* 10^9 km^3 */
, volume_rel NUMERIC          /* relative to earth */
, mass NUMERIC                /* 10^21 kg */
, mass_rel NUMERIC            /* relative to earth */
, density NUMERIC             /* g/cm^3 */
, surface_gravity NUMERIC     /* m/s^2 */
, surface_gravity_rel NUMERIC /* relative to earth */
, type_of_object TEXT
, shape TEXT
);
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Sun',696342,109.3,1414300000,1305700,1988550000,333000,1.408,274,28.02,'star','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Jupiter',69911,10.97,1431280,1321,1898600,317.83,1.326,24.79,2.535,'planet (gas giant) has rings','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Saturn',58232,9.14,827130,764,568460,95.159,0.687,10.445,1.06,'planet (gas giant) has rings','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Uranus',25362,3.98,68340,63.1,86832,14.536,1.27,8.87,0.9,'planet (ice giant) has rings','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Neptune',24622,3.86,62540,57.7,102430,17.147,1.638,11.15,1.14,'planet (ice giant) has rings','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Earth',6371,1,1083.21,1,5973.60,1,5.514,9.78033,0.99732,'planet (terrestrial)','round ');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Venus',6051.8,0.95,928.43,0.857,4868.50,0.815,5.243,8.872,0.905,'planet (terrestrial)','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Mars',3389.5,0.532,163.18,0.151,641.85,0.107,3.9335,3.7,0.38,'planet (terrestrial)','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Ganymede',2634.1,0.413,76.3,0.0704,148.2,0.0248,1.936,1.428,0.15,'satellite of Jupiter','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Titan ',2576,0.404,71.52,0.066,134.5,0.0225,1.8798,1.354,0.14,'satellite of Saturn','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Mercury',2439.7,0.383,60.83,0.0562,330.2,0.0553,5.427,3.7,0.38,'planet (terrestrial)','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Callisto',2410.3,0.378,58.65,0.0541,107.6,0.018,1.8344,1.23603,0.126,'satellite of Jupiter','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Io',1821.6,0.286,25.32,0.0234,89.3,0.015,3.528,1.797,0.183,'satellite of Jupiter','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Moon',1737.1,0.273,21.958,0.0203,73.5,0.0123,3.3464,1.625,0.166,'satellite of Earth','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Europa',1560.8,0.245,15.93,0.0147,48,0.00803,3.013,1.316,0.134,'satellite of Jupiter','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Triton ',1353.4,0.212,10.38,0.0096,21.5,0.00359,2.061,0.782,0.0797,'satellite of Neptune','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('PlutoR',1184,0.185,7,0.0066,13.105,0.0022,2.03,0.61,0.062,'dwarf planet plutino multiple','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('ErisR',1163,0.182,7,0.007,16.7,0.0027,2.52,0.662,0.0677,'dwarf planet SDO binary','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Titania ',788.4,0.124,2.06,0.0019,3.526,0.00059,1.711,0.378,0.0385,'satellite of Uranus','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Rhea ',763.8,0.12,1.87,0.0017,2.3166,0.00039,1.236,0.26,0.027,'satellite of Saturn','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Oberon ',761.4,0.12,1.85,0.0017,3.014,0.0005,1.63,0.347,0.035,'satellite of Uranus','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Iapetus ',734.5,0.113,1.55,0.0014,1.9739,0.00033,1.088,0.223,0.0227,'satellite of Saturn','round (not in technical HE)');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('MakemakeR',715,'',1.7,'','','',2.3,'','','dwarf planet cubewano','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ("2007 OR10",640,0.1,1.0981,0.00101,'','','','','','resonant KBO (3:10)','unknown');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('HaumeaR',620,0.117,1.3,0.001,4.006,0.00069,2.55,0.44,0.045,'dwarf planet resonant KBO (7:12) trinary','round (scalene ellipsoid)');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Charon ',603.5,0.095,0.87,0.0008,1.52,0.00025,1.65,0.279,0.028,'satellite of Pluto','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Umbriel ',584.7,0.092,0.84,0.0008,1.2,0.0002,1.39,0.234,0.024,'satellite of Uranus','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Ariel  ',578.9,0.091,0.81,0.0008,1.35,0.00022,1.66,0.269,0.027,'satellite of Uranus','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Dione ',561.4,0.088,0.73,0.0007,1.096,0.000183,1.478,0.232,0.0236,'satellite of Saturn','round (not in technical HE)');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Quaoar',555,'','','',1.4,0.0003,2.2,0.125,'','cubewano binary','unknown');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Tethys ',531.1,0.083,0.624,0.0006,0.6173,0.000103,0.984,0.145,0.015,'satellite of Saturn','round');
INSERT INTO solar_system_objects(body,mean_radius,mean_radius_rel,volume,volume_rel,mass,mass_rel,density,surface_gravity,surface_gravity_rel,type_of_object,shape) VALUES ('Ceres ',476.2,0.076,0.437,0.0004,0.95,0.000159,2.077,0.27,0.0275,'dwarf planet belt asteroid','round');

SELECT body, MAX(mean_radius) FROM solar_system_objects;
SELECT body, MIN(density) FROM solar_system_objects;
SELECT ROUND(SUM(volume)) AS sum_volume FROM solar_system_objects;
SELECT body AS strange_object FROM solar_system_objects
    WHERE surface_gravity_rel < 1 AND mass_rel > 1;
SELECT body AS dwarfs_and_giants FROM solar_system_objects
    WHERE type_of_object LIKE "%dwarf%" OR type_of_object LIKE "%giant%";
SELECT COUNT(*), CASE
    WHEN shape LIKE "round" THEN "round_object"
    ELSE "other_object"
    END "shapes"
FROM solar_system_objects
GROUP BY shapes;
    
